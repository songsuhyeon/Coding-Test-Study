import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int T;
	static long[] arr = new long[101];

	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());

		arr[1] = arr[2] = arr[3] = 1;
		arr[4] = arr[5] = 2;

		for (int i = 6; i <= 100; i++) {
			arr[i] = arr[i - 1] + arr[i - 5];
		}

		for (int i = 0; i < T; i++) {
			sb.append(arr[Integer.parseInt(br.readLine())]).append("\n");
		}
		System.out.println(sb);
	}

}
