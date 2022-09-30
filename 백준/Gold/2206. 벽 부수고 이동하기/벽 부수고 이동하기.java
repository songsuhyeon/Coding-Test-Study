import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static int N, M, num;
	static int[] dr = { -1, 1, 0, 0 };
	static int[] dc = { 0, 0, -1, 1 };
	static int[][] map;
	static boolean[][][] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		map = new int[N][M];
		visited = new boolean[N][M][2];
		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			for (int j = 0; j < M; j++) {
				map[i][j] = s.charAt(j) - '0';
			}
		}

		bfs(0, 0);

	}

	private static void bfs(int r, int c) {
		Queue<Pos> q = new LinkedList<>();
		q.add(new Pos(r, c, 0));
		visited[r][c][0] = true;

		int size = 0;
		boolean flag = false;
		loop: while (!q.isEmpty()) {			
			size = q.size();
			
			num++;
			
			for (int i = 0; i < size; i++) {
				Pos cur = q.poll();

				if (cur.x == N - 1 && cur.y == M - 1) {
					flag = true;
					break loop;
				}

				if (cur.cnt < 1) {
					for (int j = 0; j < 4; j++) {
						int nr = cur.x + dr[j];
						int nc = cur.y + dc[j];

						if (check(nr, nc))
							continue;

						if (!visited[nr][nc][cur.cnt+1] && map[nr][nc] == 1) {
							visited[nr][nc][cur.cnt+1] = true;
							q.add(new Pos(nr, nc, cur.cnt+1));
						}

					}
				}

				for (int j = 0; j < 4; j++) {
					int nr = cur.x + dr[j];
					int nc = cur.y + dc[j];

					if (check(nr, nc))
						continue;

					if (!visited[nr][nc][cur.cnt] && map[nr][nc] == 0) {
						q.add(new Pos(nr, nc, cur.cnt));
						visited[nr][nc][cur.cnt] = true;
					}

				}

			}

		}

		if (flag)
			System.out.println(num);
		else
			System.out.println(-1);

	}

	private static boolean check(int nr, int nc) {
		return nr < 0 || nr >= N || nc < 0 || nc >= M;
	}

	static class Pos {
		int x;
		int y;
		int cnt;

		public Pos(int x, int y, int cnt) {
			super();
			this.x = x;
			this.y = y;
			this.cnt = cnt;
		}
	}

}
