import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int T, N;
	
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		
		for (int t = 0; t < T; t++) {
			st = new StringTokenizer(br.readLine(), " ");
			N = Integer.parseInt(st.nextToken());
			long[] arr = new long[N];
			for (int i = 0; i < N; i++) {
				arr[i] = Long.parseLong(st.nextToken());
			}
			
			long sum = 0;
			for (int i = 0; i < N; i++) {
				for (int j = i+1; j < N; j++) {
					sum += gcd(arr[i], arr[j]);
				}
			}
			sb.append(sum).append("\n");
		}
		System.out.println(sb);
	}

	private static long gcd(long a, long b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}

}
