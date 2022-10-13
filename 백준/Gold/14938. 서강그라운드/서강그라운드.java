import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	static int N, M, R;
	static int MAX_LEN = 16;
	static int[][] arr;
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());

		int[] items = new int[N + 1];
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= N; i++) {
			items[i] = Integer.parseInt(st.nextToken());
		}

		arr = new int[N + 1][N + 1];
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				arr[i][j] = MAX_LEN;
			}
		}

		for (int i = 1; i <= R; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());

			arr[s][e] = v;
			arr[e][s] = v;
		}

		for (int k = 1; k <= N; k++) {
			for (int s = 1; s <= N; s++) {
				for (int e = 1; e <= N; e++) {
					if (k == s || s == e || k == e)
						continue;
					
					arr[s][e] = Math.min(arr[s][e], arr[s][k] + arr[k][e]);
				}
			}
		}

		int maxNum = 0;
		for (int i = 1; i <= N; i++) {
			int temp = items[i];
			for (int j = 1; j <= N; j++) {
				if (arr[i][j] <= M) {
					temp += items[j];
				}
			}
			maxNum = Math.max(temp, maxNum);
		}
		System.out.println(maxNum);
	}

} // end of class
