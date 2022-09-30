import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	static int N;
	static BigInteger[] dp;

	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());

		dp = new BigInteger[N+2];
		dp[0] = BigInteger.ZERO;
		dp[1] = BigInteger.ONE;
		
		for (int i = 2; i <= N; i++) {
			dp[i] = dp[i-2].add(dp[i-1]);
		}
		System.out.println(dp[N]);
	}

}
