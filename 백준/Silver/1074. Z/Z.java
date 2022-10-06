import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static StringTokenizer st;
	static int N, R, C, size, cnt;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());

		getCnt((int) Math.pow(2, N), R, C);

	}

	private static void getCnt(int size, int r, int c) {
		if (size == 1) {
			System.out.println(cnt);
			return;
		}

		int n = size / 2;
		if (r < n && c < n) { // 1사분면
			cnt += n * n * 0;
			getCnt(n, r, c);
		} else if (r < n && c < n + n) { // 2사분면
			cnt += n * n * 1;
			getCnt(n, r, c - n);
		} else if (r < n + n && c < n) { // 3사분면
			cnt += n * n * 2;
			getCnt(n, r - n, c);
		} else if (r < n + n && c < n + n) { // 4사분면
			cnt += n * n * 3;
			getCnt(n, r - n, c - n);
		}

	}

}
