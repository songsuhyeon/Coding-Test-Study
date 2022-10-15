import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		Map<String, String> map = new HashMap<>();
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			map.put(st.nextToken(), st.nextToken());
		}
		
		for (int i = 0; i < M; i++) {
			String s = br.readLine();
			sb.append(map.get(s)).append("\n");
		}
		System.out.println(sb);
	} // end of main

} // end of class