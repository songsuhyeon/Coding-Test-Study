import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {


	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String s = br.readLine();
			if (s.equals("0"))
				break;

			int start = 0;
			int end = s.length() - 1;

			boolean flag = true;

			while (start < end) {
				if (s.charAt(start) == s.charAt(end)) {
					start++;
					end--;
					continue;
				} else {
					flag = false;
					break;
				}

			}

			if (flag)
				System.out.println("yes");
			else
				System.out.println("no");
		}
	}

}
