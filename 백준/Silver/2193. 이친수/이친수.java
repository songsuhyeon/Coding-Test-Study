import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static long[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        dp = new long[N+1][2];
        
        dp[1][1] = 1;
        dp[1][0] = 0;
        
        for (int i = 2; i <= N; i++) {
			dp[i][0] = dp[i-1][1] + dp[i-1][0];  // 0으로 끝나는 이친수 개수
			dp[i][1] = dp[i-1][0];  // 1로 끝나는 이친수 개수
		}
        System.out.println(dp[N][0] + dp[N][1]);
    }
}