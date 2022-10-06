import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		char[][] grid = new char[N+1][N+1];
		for (int i = 1; i <= N; i++) {
			String s = br.readLine();
			for (int j = 1, index = 0; j <= N; j++, index += 2) {
				grid[i][j] = s.charAt(index);
			}
		}
		long[][][] memo = new long[N+1][N+1][3];
		memo[1][2][0] = 1;
		
		for (int i = 1; i <= N; i++) {
			for (int j = 3; j <= N; j++) {
				if(grid[i][j] != '0') continue; 
				memo[i][j][0] = memo[i][j-1][2] + memo[i][j-1][0];
				memo[i][j][1] = memo[i-1][j][2] + memo[i-1][j][1];
				if(grid[i][j-1] == '0' && grid[i-1][j] == '0')
				memo[i][j][2] = memo[i-1][j-1][0] + memo[i-1][j-1][1] + memo[i-1][j-1][2];
			}
		}
		System.out.println(memo[N][N][0] + memo[N][N][1] + memo[N][N][2]);
	}
}