import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static int R, C, time, cnt;
	static ArrayList<Integer> list = new ArrayList<>();
	static int[][] map;
	static int[] dr = { -1, 1, 0, 0 };
	static int[] dc = { 0, 0, -1, 1 };
	static boolean[][] visited;
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		st = new StringTokenizer(br.readLine(), " ");
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());

		map = new int[R][C];
		for (int i = 0; i < R; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < C; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		while (true) {
			cnt = 0;
			// 치즈 조각 세기
			for (int i = 1; i < R - 1; i++) {
				for (int j = 1; j < C - 1; j++) {
					if (map[i][j] == 1)
						cnt++;
				}
			}
			
			if(cnt == 0)
				break;
			
			visited = new boolean[R][C];
			bfs(0, 0);
			time++;
			list.add(cnt);
		}

		System.out.println(time);
		if(list.size() > 0)
			System.out.println(list.get(list.size()-1));
		else
			System.out.println(0);

	} // end of main

	private static void bfs(int r, int c) {
		Queue<Pos> q = new LinkedList<>();
		q.add(new Pos(r, c));
		visited[r][c] = true;

		while (!q.isEmpty()) {
			Pos cur = q.poll();

			for (int i = 0; i < 4; i++) {
				int nr = cur.x + dr[i];
				int nc = cur.y + dc[i];

				if (check(nr, nc) || visited[nr][nc])
					continue;

				if (map[nr][nc] == 1) {
					map[nr][nc] = 0;
					visited[nr][nc] = true;
				} else if (map[nr][nc] == 0) {
					q.add(new Pos(nr, nc));
					visited[nr][nc] = true;
				}
			}
		}
	}

	private static boolean check(int nr, int nc) {
		return nr < 0 || nr >= R || nc < 0 || nc >= C;
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
