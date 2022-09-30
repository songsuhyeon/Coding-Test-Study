import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

class Main {

	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int testCase = 1; testCase <= T; testCase++) {
			String cmd = br.readLine();
			int n = Integer.parseInt(br.readLine());
			Deque<Integer> deque = new ArrayDeque<>();

			String nums = br.readLine();
			nums = nums.substring(1, nums.length() - 1);
			StringTokenizer st = new StringTokenizer(nums, ",");
			for (int i = 0; i < n; i++) {
				deque.add(Integer.parseInt(st.nextToken()));
			}

			boolean flag = true;
			boolean check = true; // false : -> | true : <-
			for (int i = 0; i < cmd.length(); i++) {
				switch (cmd.charAt(i)) {
				case 'R':
					check = (check ? false : true);
					break;
				case 'D':
					if (check) { // <- : 앞에서 부터 삭제
						if (!deque.isEmpty()) {
							deque.removeFirst();
						} else {
							flag = false;
							break;
						}
					} else { // -> : 뒤에서 부터 삭제
						if (!deque.isEmpty()) {
							deque.removeLast();
						} else {
							flag = false;
							break;
						}
					}
					break;
				}
				if (!flag)
					break;
			}

			if (flag && !deque.isEmpty()) {
				sb.append("[");
				int size = deque.size();
				for (int i = 0; i < size - 1; i++) {
					if(check) {  // <- : 앞에서 부터 삭제
						sb.append(deque.pollFirst()).append(",");
					} else { // -> : 뒤에서 부터 삭제
						sb.append(deque.pollLast()).append(",");
					}
				}
				sb.append(deque.poll()).append("]").append("\n");
			} else if (flag && deque.isEmpty()) {
				sb.append("[]").append("\n");
			} else {
				sb.append("error").append("\n");
			}
		}
		System.out.println(sb);
	}
}