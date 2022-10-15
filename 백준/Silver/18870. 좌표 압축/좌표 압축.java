import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	static int N;

	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int[] copy = new int[N];
		Map<Integer, Integer> map = new TreeMap<>();
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			arr[i] = copy[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(copy);

		int r = 0;
		for (int i : copy) {
			if (!map.containsKey(i)) {
				map.put(i, r);
				r++;
			}
		}
		
		for (int i : arr) {
			sb.append(map.get(i)).append(" ");
		}
		System.out.println(sb);
	} // end of main

} // end of class