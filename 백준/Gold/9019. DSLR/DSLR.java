import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static int a, b;
	static boolean[] visited;

	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());

			visited = new boolean[10001];
			bfs();
		} // end of tc
		System.out.println(sb);
	} // end of main

	private static void bfs() {
		Queue<Data> q = new LinkedList<>();
		q.add(new Data(a, 0, ""));
		visited[a] = true; 

		while (!q.isEmpty()) {

			Data cur = q.poll();
			
			if (cur.num == b) {
				sb.append(cur.cmd).append("\n");
				return;
			}

			int n = cur.num;

			int d = (2 * n) % 10000;
			if (!visited[d]) {
				visited[d] = true;
				q.add(new Data(d, cur.cnt + 1, cur.cmd + "D"));
			}

			int s = ((n - 1) < 0 ? 10000 + (n - 1) : (n - 1));
			if (!visited[s]) {
				visited[s] = true;
				q.add(new Data(s, cur.cnt + 1, cur.cmd + "S"));
			}

			// 1234 -> 2341
			// 1234를 1000으로 나눈 나머지(234)에 10을 곱함=2340, 1234를 1000으로 나누면 1, 2340+1=2341
			int l = (n % 1000) * 10 + n / 1000;
			if (!visited[l]) {
				visited[l] = true;
				q.add(new Data(l, cur.cnt + 1, cur.cmd + "L"));
			}

			// 1234 -> 4123
			// 1234를 10으로 나눈 나머지에 1000 곱합 = 4000, 1234를 10으로 나누면 123, 4000+123=4123
			int r = (n % 10) * 1000 + n / 10;
			if (!visited[r]) {
				visited[r] = true;
				q.add(new Data(r, cur.cnt + 1, cur.cmd + "R"));
			}

		}

	}

	static class Data {
		int num;
		int cnt;
		String cmd;

		public Data(int num, int cnt, String cmd) {
			super();
			this.num = num;
			this.cnt = cnt;
			this.cmd = cmd;
		}
	}

} // end of class