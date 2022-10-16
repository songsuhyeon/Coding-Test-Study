import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[N]; // 수열의 수들
		int[] LIS = new int[N]; // 동적테이블 : 각 원소를 끝으로하는 LIS 값

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int max = 0;
		// 앞쪽부터 모든 원소 기준으로 자신을 끝으로하는 LIS 계산
		for (int i = 0; i < N; i++) {
			LIS[i] = 1;
			for (int j = 0; j < i; j++) {
				if (arr[j] < arr[i] && LIS[i] < LIS[j] + 1)
					LIS[i] = LIS[j] + 1;
			}
			max = Math.max(max, LIS[i]);
		}
		//System.out.println(Arrays.toString(LIS));
		System.out.println(max);
	}

}