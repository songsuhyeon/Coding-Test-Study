import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	static int T, K;

	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());

		for (int testcase = 0; testcase < T; testcase++) {
			K = Integer.parseInt(br.readLine());

			boolean flag = false;
			TreeMap<Integer, Integer> map = new TreeMap<>();
			for (int i = 0; i < K; i++) {
				st = new StringTokenizer(br.readLine());
				char cmd = st.nextToken().charAt(0);
				int num = Integer.parseInt(st.nextToken());

				switch (cmd) {
				case 'I':
					flag = false;
					if (map.containsKey(num))
						map.put(num, map.get(num) + 1);
					else
						map.put(num, 0);
					break;
				case 'D':
					if (map.size() == 0)
						continue;

					if (num == -1) { // 최솟값 삭제
						if (map.get(map.firstKey()) == 0)
							map.pollFirstEntry().getKey();
						else
							map.put(map.firstKey(), map.get(map.firstKey()) - 1);
					} else { // 최댓값 삭제
						if (map.get(map.lastKey()) == 0)
							map.pollLastEntry().getKey();
						else
							map.put(map.lastKey(), map.get(map.lastKey()) - 1);
					}

					break;
				}
			}
			
			if (map.isEmpty())
				sb.append("EMPTY").append("\n");
			else
				sb.append(map.lastKey()).append(" ").append(map.firstKey()).append("\n");

		} // end of testCase
		System.out.println(sb);

	} // end of main

} // end of class