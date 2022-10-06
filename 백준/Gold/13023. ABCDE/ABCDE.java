import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	static int N, M;
	static boolean check;
	static boolean[] visited;
	static ArrayList<Integer> graph[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		graph = new ArrayList[N + 1];

		for (int i = 0; i < N + 1; i++) {
			graph[i] = new ArrayList<>();
		}

		for (int i = 1; i <= M; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());

			graph[u].add(v);
			graph[v].add(u);
		}

		check = false;
		for (int i = 0; i < N; i++) {
			visited = new boolean[N + 1];
			DFS(i, 1);
			
			if (check) {
				System.out.println(1);
				return;
			}
		}
		System.out.println(0);
	}

	static void DFS(int v, int depth) {

		if (depth == 5) {
			check = true;
			return;
		}
		

		visited[v] = true;
		for (int i : graph[v]) {
			if (!visited[i]) {
				DFS(i, depth+1);
			}
		}
		visited[v] = false;
	}

}

