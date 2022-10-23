import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	static int S;
	static boolean[][] visited;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		S = Integer.parseInt(br.readLine());

		visited = new boolean[2001][2001];

		bfs();

	}

	private static void bfs() {
		Queue<E> q = new LinkedList<Main.E>();
		q.add(new E(1, 0, 0));
		visited[1][0] = true;

		while (!q.isEmpty()) {
			E cur = q.poll();

			if (cur.c == S) {
				System.out.println(cur.time);
				return;
			}

			// 저장
			q.add(new E(cur.c, cur.c, cur.time + 1));

			// 붙여넣기 :클립보드가 비어있는 상태에는 붙여넣기를 할 수 없음
			if (cur.b != 0 && cur.c + cur.b <= S && !visited[cur.b][cur.c + cur.b]) {
				q.add(new E(cur.c + cur.b, cur.b, cur.time + 1));
				visited[cur.b][cur.c + cur.b] = true;
			}

			// 삭제
			if (cur.c - 1 > 0 && !visited[cur.b][cur.c - 1]) {
				q.add(new E(cur.c - 1, cur.b, cur.time + 1));
				visited[cur.b][cur.c - 1] = true;
			}

		}

	}

	static class E {
		int c; // 현재 이모티콘 개수
		int b; // 클립보드 이모티콘 개수
		int time;

		public E(int c, int b, int time) {
			super();
			this.c = c;
			this.b = b;
			this.time = time;
		}
	}
}
