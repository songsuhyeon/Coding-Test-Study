import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static int T, W, H, num;
	static int[][] map;
	static int[] dr = { -1, 1, 0, 0 };
	static int[] dc = { 0, 0, -1, 1 };
	static Queue<Pos> q;
	static Queue<Pos> fire;
	static boolean[][] visited;
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		for (int t = 0; t < T; t++) {
			num = 0;
			
			st = new StringTokenizer(br.readLine(), " ");
			W = Integer.parseInt(st.nextToken());
			H = Integer.parseInt(st.nextToken());
			
			q = new LinkedList<>();
			fire = new LinkedList<>();

			map = new int[H + 2][W + 2];
			visited = new boolean[H + 2][W + 2];
			
			for (int i = 1; i <= H; i++) {
				String s = br.readLine();
				for (int j = 1; j <= W; j++) {
					map[i][j] = s.charAt(j - 1);
					if (map[i][j] == '@') {
						q.add(new Pos(i, j));
						visited[i][j] = true;
					} else if (map[i][j] == '*') {
						fire.add(new Pos(i, j));
						visited[i][j] = true;
					}
				}
			}			
			if(bfs())
				sb.append(num).append("\n");
			else
				sb.append("IMPOSSIBLE").append("\n");
		}
		System.out.println(sb);
	} // end of main

	private static boolean bfs() {

		int size1 = q.size();
		int size2 = fire.size();
		while (!q.isEmpty()) {
			
			size2 = fire.size();
			// 불 옮기기
			for (int t = 0; t < size2; t++) {
				Pos cur = fire.poll();

				for (int i = 0; i < 4; i++) {
					int nr = cur.x + dr[i];
					int nc = cur.y + dc[i];

					if (check(nr, nc) || visited[nr][nc])
						continue;

					if (map[nr][nc] == '.' || map[nr][nc] == '@') {
						map[nr][nc] = '*';
						fire.add(new Pos(nr, nc));
						visited[nr][nc] = true;
					}
				}

			}
			
			num++;
			size1 = q.size();
			for (int t = 0; t < size1; t++) {
				// 상근이 이동
				Pos cur = q.poll();
				if (cur.x == 1 || cur.x == H  || cur.y == 1 || cur.y == W ) {
					return true;
				}

				for (int i = 0; i < 4; i++) {
					int nr = cur.x + dr[i];
					int nc = cur.y + dc[i];

					if (check(nr, nc) || visited[nr][nc])
						continue;

					if (map[nr][nc] == '.') {
						map[nr][nc] = '@';
						q.add(new Pos(nr, nc));
						visited[nr][nc] = true;
					}
				}
				
			}
//			System.out.println("num : " + num);
//			for (int i = 0; i < H + 2; i++) {
//				for (int j = 0; j < W + 2; j++) {
//					System.out.print((char) map[i][j] + " ");
//				}
//				System.out.println();
//			}
//			System.out.println("==============");

		}
		return false;
	}

	private static boolean check(int nr, int nc) {
		return nr < 1 || nr >= H + 1 || nc < 1 || nc >= W + 1;
	}

	static class Pos {
		int x;
		int y;

		public Pos(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}
	}

} // end of class
