import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int T, N;
	static long[][] dp;

	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());

		
		for (int testCase = 0; testCase < T; testCase++) {
			N = Integer.parseInt(br.readLine());
			
			dp = new long[N + 2][2];
			dp[0][0] = 1; dp[0][1] = 0;
			dp[1][0] = 0; dp[1][1] = 1;
			
			for (int i = 2; i <= N; i++) {
				for (int j = 0; j < 2; j++) {
					dp[i][j] = dp[i-2][j] + dp[i-1][j];
				}
			}
			sb.append(dp[N][0]).append(" ").append(dp[N][1]).append("\n");
		}
		System.out.println(sb);
	}

}
