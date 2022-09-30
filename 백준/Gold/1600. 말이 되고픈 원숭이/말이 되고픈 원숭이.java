import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static int K, W, H, num;
	static int[][] map;
	static boolean[][][] visited;
	static int[] dr = { 1, -1, 0, 0 };
	static int[] dc = { 0, 0, -1, 1 };
	static int[] hr = { 1, 2, 2, 1, -1, -2, -2, -1 };
	static int[] hc = { 2, 1, -1, -2, -2, -1, 1, 2 };
	static StringTokenizer st;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		K = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		W = Integer.parseInt(st.nextToken());
		H = Integer.parseInt(st.nextToken());

		visited = new boolean[H][W][31];
		map = new int[H][W];
		for (int i = 0; i < H; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < W; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		bfs(0, 0);

	}

	private static void bfs(int r, int c) {
		Queue<Pos> q = new LinkedList<>();
		q.add(new Pos(r, c, 0));
		visited[r][c][0] = true;

		boolean flag = false; // 탈출 가능 여부 체크
		int size = 0;
		loop: while (!q.isEmpty()) {
			size = q.size();

			num++;

			for (int i = 0; i < size; i++) {
				Pos cur = q.poll();
				
				if (cur.x == H - 1 && cur.y == W - 1) {
					num--;
					flag = true;
					break loop;
				}

				if (cur.cnt < K) { // 말처럼 이동
					for (int j = 0; j < 8; j++) {
						int nr = cur.x + hr[j];
						int nc = cur.y + hc[j];

						if (check(nr, nc))
							continue;

						if (!visited[nr][nc][cur.cnt + 1] && map[nr][nc] == 0) {
							visited[nr][nc][cur.cnt + 1] = true;
							q.add(new Pos(nr, nc, cur.cnt + 1));
						}

					}
				}

				for (int j = 0; j < 4; j++) {
					int nr = cur.x + dr[j];
					int nc = cur.y + dc[j];

					if (check(nr, nc))
						continue;

					if (!visited[nr][nc][cur.cnt] && map[nr][nc] == 0) {
						visited[nr][nc][cur.cnt] = true;
						q.add(new Pos(nr, nc, cur.cnt));
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
		return nr < 0 || nr >= H || nc < 0 || nc >= W;
	}

	static public class Pos {
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