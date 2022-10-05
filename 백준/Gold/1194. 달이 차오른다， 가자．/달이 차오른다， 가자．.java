import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main{

	static int N, M, cnt; // 세로 크기 N과 가로 크기 M
	static int[][] map;
	static boolean[][][] visited;
	static int[] dr = { -1, 1, 0, 0 };
	static int[] dc = { 0, 0, -1, 1 };
	static int[] now = new int[2];

	static StringTokenizer st;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		map = new int[N][M];
		visited = new boolean[N][M][64];
		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			for (int j = 0; j < M; j++) {
				map[i][j] = s.charAt(j);
				if (map[i][j] == '0') {
					now[0] = i;
					now[1] = j;
				}
			}
		}

		bfs(now[0], now[1]);

	} // end of main

	private static void bfs(int r, int c) {

		Queue<Pos> q = new LinkedList<>();
		q.add(new Pos(r, c, 0));
		visited[r][c][0] = true;
		boolean flag = false;

		loop: while (!q.isEmpty()) {

			int size = q.size();
			cnt++;

			for (int t = 0; t < size; t++) {
				Pos cur = q.poll();

				if (map[cur.x][cur.y] == '1') { // 탈출하는 곳
					flag = true;
					break loop;
				}

				for (int i = 0; i < 4; i++) {

					int nr = cur.x + dr[i];
					int nc = cur.y + dc[i];

					if (check(nr, nc))
						continue;
					if (map[nr][nc] == '#')
						continue;

					// 빈 칸, 열쇠 공간인 경우
					if (map[nr][nc] == '.' || map[nr][nc] == '0' || map[nr][nc] == '1') {
						if (!visited[nr][nc][cur.key]) {
							q.add(new Pos(nr, nc, cur.key));
							visited[nr][nc][cur.key] = true;
						}
					} else if (map[nr][nc] >= 'a' && map[nr][nc] <= 'f') {
						int add_key = cur.key | (1 << (map[nr][nc] - 'a'));
						if (!visited[nr][nc][add_key]) {
							q.add(new Pos(nr, nc, add_key));
//							visited[nr][nc][cur.key] = true;
							visited[nr][nc][add_key] = true;
						}
					}
					// 문이 있는 경우
					else if (map[nr][nc] >= 'A' && map[nr][nc] <= 'F') {
						int use_key = cur.key & (1 << (map[nr][nc] - 'A'));
						if (!visited[nr][nc][cur.key] && use_key != 0) {
							q.add(new Pos(nr, nc, cur.key));
							visited[nr][nc][cur.key] = true;
						}
					}
				}
			}
		}

		if (flag)
			System.out.println(cnt - 1);
		else
			System.out.println(-1);

	} // end of bfs

	private static boolean check(int nr, int nc) {
		return nr < 0 || nr >= N || nc < 0 || nc >= M;
	} // end of check

	static class Pos {
		int x;
		int y;
		int key;

		public Pos(int x, int y, int key) {
			super();
			this.x = x;
			this.y = y;
			this.key = key;
		}
	}

} // end of class
