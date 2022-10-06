import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[][] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		arr = new int[n + 2][n + 2];
		for (int i = 0; i < n + 2; i++) {
			arr[i][1] = i;
			arr[i][0] = 1;
			arr[i][i] = 1;
		}

		for (int i = 2; i < arr.length; i++) {
			for (int j = 2; j < i; j++) {
				arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
			}
		}

		System.out.println(arr[n - 1][k - 1]);

	}

}
