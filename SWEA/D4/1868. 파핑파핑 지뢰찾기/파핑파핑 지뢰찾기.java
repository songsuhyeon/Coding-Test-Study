import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution {

	static int T, N, bombCnt, blockCnt, clickCnt;
	static char[][] arr;
	static int[][] bombCntArr;
	static boolean[][] visited;
	static int[] dr = { -1, -1, -1, 0, 0, 1, 1, 1 };
	static int[] dc = { -1, 0, 1, -1, 1, -1, 0, 1 };

	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			clickCnt = 0;
			N = Integer.parseInt(br.readLine());

			bombCntArr = new int[N][N];
			arr = new char[N][N];
			for (int i = 0; i < N; i++) {
				String s = br.readLine();
				for (int j = 0; j < N; j++) {
					arr[i][j] = s.charAt(j);
				}
			}

			// 칸 별 폭탄 개수 세기
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (arr[i][j] == '.') {
						int bCnt = 0;
						for (int k = 0; k < 8; k++) {
							int nr = i + dr[k];
							int nc = j + dc[k];

							if (check(nr, nc))
								continue;

							if (arr[nr][nc] == '*')
								bCnt++;
						}
						bombCntArr[i][j] = bCnt;
					}
				}
			}

			// 최소 개수 구해야 함 -> 폭탄 개수 0인 곳부터 click++
			visited = new boolean[N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (bombCntArr[i][j] == 0 && arr[i][j] == '.' && !visited[i][j]) {
						clickCnt++;
						bfs(i, j);
					}
				}
			}

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (arr[i][j] == '*' || bombCntArr[i][j] == 0 || visited[i][j])
						continue;

					clickCnt++;
				}
			}

			sb.append("#").append(tc).append(" ").append(clickCnt).append("\n");
		} // end of tc

		System.out.println(sb);
	}

	private static void p() {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(bombCntArr[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("--------------");
	}

	private static void bfs(int r, int c) {
		Queue<Pos> q = new LinkedList<>();
		q.add(new Pos(r, c));
		visited[r][c] = true;

		while (!q.isEmpty()) {
			Pos cur = q.poll();

			for (int i = 0; i < 8; i++) {
				int nr = cur.x + dr[i];
				int nc = cur.y + dc[i];

				if (check(nr, nc) || visited[nr][nc] || arr[nr][nc] == '*')
					continue;

				if (bombCntArr[nr][nc] == 0 && arr[nr][nc] == '.') {
					q.add(new Pos(nr, nc));
					visited[nr][nc] = true;
				} else if(arr[nr][nc] == '.') {
					visited[nr][nc] = true;
				} 
			}
		}

	} // end of bfs

	private static boolean check(int nr, int nc) {
		return nr < 0 || nr >= N || nc < 0 || nc >= N;
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

}
