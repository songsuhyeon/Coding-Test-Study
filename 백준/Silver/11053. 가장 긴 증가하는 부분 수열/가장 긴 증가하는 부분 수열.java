import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[N]; // 수열의 수들
		int[] C = new int[N]; // 동적테이블 C[k]: 해당(k) 길이를 만족하는 자리(k자리)에 오는 수의 최소값

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int size = 0;

		for (int i = 0; i < N; i++) {
			int pos = Arrays.binarySearch(C, 0, size, arr[i]);
			if (pos >= 0)	continue;  // 배열에 arr[i]가 있는 경우

			// 배열에 arr[i]가 없는 경우
			int insertPos = Math.abs(pos) - 1; // 맨 뒤 or 기존 원소 대체 자리
			C[insertPos] = arr[i];

			if (insertPos == size)  size++;
		}
		System.out.println(size);
	}

}