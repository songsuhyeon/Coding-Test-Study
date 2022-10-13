import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static int N, M, T, num;
	static boolean gram = false;
	static int[] dr = { -1, 1, 0, 0 };
	static int[] dc = { 0, 0, -1, 1 };
	static int[][] arr;
	static boolean[][][] visited;
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		T = Integer.parseInt(st.nextToken());

		arr = new int[N][M];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < M; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		visited = new boolean[N][M][2];
		System.out.println(bfs(0, 0, 0) ? num - 1 : "Fail");

	}

	private static boolean bfs(int r, int c, int g) {
		Queue<Pos> q = new LinkedList<Main.Pos>();
		q.add(new Pos(r, c, g));
		visited[r][c][g] = true;

		loop: while (!q.isEmpty()) {
			num++;
			
			if(num > T+3) {
				return false;
			}
			
			int size = q.size();
			for (int t = 0; t < size; t++) {
				Pos cur = q.poll();
				if (cur.x == N - 1 && cur.y == M - 1 && num - 1 <= T)
					return true;

				for (int i = 0; i < 4; i++) {
					int nr = cur.x + dr[i];
					int nc = cur.y + dc[i];

					if (check(nr, nc))
						continue;

					if (cur.gram == 1) { // 그람 있음
						if (!visited[nr][nc][1]) {
							q.add(new Pos(nr, nc, 1));
							visited[nr][nc][1] = true;
						}
					} else { // 그람 없음
						if (!visited[nr][nc][0] && arr[nr][nc] == 0) {
							q.add(new Pos(nr, nc, cur.gram));
							visited[nr][nc][0] = true;
						} else if (!visited[nr][nc][cur.gram] && arr[nr][nc] == 2) {
							q.add(new Pos(nr, nc, 1));
							visited[nr][nc][0] = true;
							visited[nr][nc][1] = true;
						}
					}
				}
			}
		}
		return false;
	}

	private static boolean check(int nr, int nc) {
		return nr < 0 || nr >= N || nc < 0 || nc >= M;
	}

	static class Pos {
		int x;
		int y;
		int gram;
		
		public Pos(int x, int y, int gram) {
			super();
			this.x = x;
			this.y = y;
			this.gram = gram;
		}

	}
}
