import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	static int N, num;
	static int[] arr;
	static boolean[] visited;
	static ArrayList<Integer> list;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());

		arr = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		list = new ArrayList<>();
		visited = new boolean[N + 1];
		for (int i = 1; i <= N; i++) {
			visited[i] = true;
			num = i;
			dfs(i);
			visited[i] = false;
		}

		Collections.sort(list);
		System.out.println(list.size());
		for (int i : list) {
			sb.append(i).append("\n");
		}
		System.out.println(sb);
		
	} // end of main

	private static void dfs(int idx) {
		if (arr[idx] == num)
			list.add(num);

		if (!visited[arr[idx]]) {
			visited[arr[idx]] = true;
			dfs(arr[idx]);
			visited[arr[idx]] = false;
		}
	}

} // end of class
