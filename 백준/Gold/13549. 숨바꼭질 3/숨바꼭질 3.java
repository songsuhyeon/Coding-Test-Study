import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static int N, K, num, max;
	static boolean[] visited;

	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());

		visited = new boolean[200001];
		bfs();

	} // end of main

	private static void bfs() {
		Queue<Data> q = new LinkedList<>();
		q.add(new Data(N, 0));

		while (!q.isEmpty()) {

			Data cur = q.poll();

			if (cur.x < 0 || cur.x > 100000)
				continue;

			if (visited[cur.x])
				continue;

			visited[cur.x] = true;

			if (cur.x == K) {
				System.out.println(cur.time);
				return;
			}

			q.add(new Data(cur.x * 2, cur.time));
			q.add(new Data(cur.x - 1, cur.time + 1));
			q.add(new Data(cur.x + 1, cur.time + 1));

		}

	}

	static class Data {
		int x;
		int time;

		public Data(int x, int time) {
			super();
			this.x = x;
			this.time = time;
		}
	}

} // end of class