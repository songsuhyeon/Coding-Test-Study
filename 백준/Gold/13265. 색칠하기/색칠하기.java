import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static int T, N, M, Cnt;
	static int[] color;
	static boolean flag;
	static boolean[] visited;
	static ArrayList<Integer> graph[];
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			N = Integer.parseInt(st.nextToken()); // 동그라미의 개수 n(1 ≤ n ≤ 1000)
			M = Integer.parseInt(st.nextToken()); // 직선들의 개수 m(1 ≤ m ≤ 100,000)

			color = new int[N + 1];
			graph = new ArrayList[N + 1];
			for (int j = 0; j < N + 1; j++) {
				graph[j] = new ArrayList<>();
			}

			for (int j = 1; j <= M; j++) {
				st = new StringTokenizer(br.readLine(), " ");
				int u = Integer.parseInt(st.nextToken());
				int v = Integer.parseInt(st.nextToken());

				graph[u].add(v);
				graph[v].add(u);
			}

			for (int j = 1; j <= N; j++) {
				flag = true;
				if (bfs(j))
					bfs(j);
				else {
					flag = false;
					break;
				}
			}
			if (flag)
				sb.append("possible").append("\n");
			else
				sb.append("impossible").append("\n");
		}
		System.out.println(sb);
	}

	private static boolean bfs(int v) {

		Queue<Integer> q = new LinkedList<>();
		q.offer(v);

		int c = 1;

		// 현재 값 색칠해져 있지 않으면 색 칠함
		if (color[v] == 0)
			color[v] = c;

		while (!q.isEmpty()) {

			int size = q.size();

			c *= -1; // 연결된 곳은 다른 색으로 칠함
			for (int i = 0; i < size; i++) {
				int cur = q.poll();

				for (Integer a : graph[cur]) {

					// 연결된 곳이 색 칠해져 있지 않다면 다른 색으로 색 칠함
					if (color[a] == 0) {
						color[a] = c;
						q.offer(a);
					} else { // 이미 색이 칠해져 있다면
						if (color[cur] == color[a]) { // 색이 같으면
							return false;
						}
					}

				}
			}

		}
		return true;
	}

}
