import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static int[][] dp;
	static int[][] score;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		dp = new int[N][3];

		score = new int[N][3];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < 3; j++) {
				score[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		dp[0][0] = score[0][0];
		dp[0][1] = score[0][1];
		dp[0][2] = score[0][2];

		for (int i = 1; i < N; i++) {
			for (int k = 0; k < 3; k++) {
				if (k == 0)
					dp[i][k] = Math.min(dp[i - 1][1], dp[i - 1][2]) + score[i][k];
				else if (k == 1)
					dp[i][k] = Math.min(dp[i - 1][0], dp[i - 1][2]) + score[i][k];
				else
					dp[i][k] = Math.min(dp[i - 1][0], dp[i - 1][1]) + score[i][k];
			}
		}
		
		System.out.println(Arrays.stream(dp[dp.length-1]).min().getAsInt());
	}

}
