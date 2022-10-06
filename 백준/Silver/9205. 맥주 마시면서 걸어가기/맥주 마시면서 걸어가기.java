import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static int T, N, houseX, houseY, destX, destY, beerCnt;
	static int[][] map;
	static boolean[] visited;

	static ArrayList<Pos> store;
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());

		for (int testcase = 0; testcase < T; testcase++) {
			N = Integer.parseInt(br.readLine());

			st = new StringTokenizer(br.readLine());
			houseX = Integer.parseInt(st.nextToken());
			houseY = Integer.parseInt(st.nextToken());

			store = new ArrayList<>();
			for (int i = 0; i < N; i++) { // 편의점 좌표
				st = new StringTokenizer(br.readLine());
				store.add(new Pos(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
			}

			st = new StringTokenizer(br.readLine());
			destX = Integer.parseInt(st.nextToken());
			destY = Integer.parseInt(st.nextToken());

			beerCnt = 20;
			sb.append(bfs() ? "happy" : "sad").append("\n");

		} // end of testCase

		System.out.println(sb);

	} // end of main

	private static boolean bfs() {
		Queue<Pos> q = new LinkedList<>();
		q.add(new Pos(houseX, houseY));

		visited = new boolean[N];

		while (!q.isEmpty()) {
			Pos cur = q.poll();

			if (Math.abs(cur.x - destX) + Math.abs(cur.y - destY) <= 1000) {
				return true;
			}

			for (int i = 0; i < N; i++) {
				if (!visited[i]) {
					int nx = store.get(i).x;
					int ny = store.get(i).y;
					if (Math.abs(cur.x - nx) + Math.abs(cur.y - ny) <= 1000) {
						visited[i] = true;
						q.add(new Pos(nx, ny));
					}
				}
			}
		}
		return false;
	} // end of bfs

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