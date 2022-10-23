import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static long A, B;

	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		st = new StringTokenizer(br.readLine(), " ");
		A = Long.parseLong(st.nextToken());
		B = Long.parseLong(st.nextToken());
		
		long g = gcd(A, B);
		for (long i = 0; i < g; i++) {
			sb.append(1);
		}
		
		System.out.println(sb);
	} // end of main

	private static long gcd(long a, long b) {
		if (b == 0) {
			return a;
		}

		return gcd(b, a % b);
	}

} // end of class
