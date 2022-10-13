import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static int N, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
	static int[] numbers, op;

	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());

		numbers = new int[N];
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			numbers[i] = Integer.parseInt(st.nextToken());
		}

		op = new int[4];
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < 4; i++) {
			op[i] = Integer.parseInt(st.nextToken());
		}

		dfs(numbers[0], op[0], op[1], op[2], op[3], 1);
		
		System.out.println(max);
		System.out.println(min);

	} // end of main

	private static void dfs(int val, int add, int sub, int mul, int div, int cnt) {

		if (cnt == N) {
			min = Math.min(min, val);
			max = Math.max(max, val);
			return;
		}

		if (add > 0)
			dfs(val + numbers[cnt], add - 1, sub, mul, div, cnt + 1);
		if (sub > 0)
			dfs(val - numbers[cnt], add, sub - 1, mul, div, cnt + 1);
		if (mul > 0)
			dfs(val * numbers[cnt], add, sub, mul - 1, div, cnt + 1);
		if (div > 0)
			dfs(val / numbers[cnt], add, sub, mul, div - 1, cnt + 1);

	} // end of dfs

} // end of class
