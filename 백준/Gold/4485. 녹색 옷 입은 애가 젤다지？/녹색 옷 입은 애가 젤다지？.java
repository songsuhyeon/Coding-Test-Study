import java.util.*;
import java.io.*;

public class Main {
	static int[][] map, cost;
	static int N;
	static int[] dx = { -1, 0, 1, 0 };
	static int[] dy = { 0, -1, 0, 1 };
	static StringTokenizer st;
	static StringBuilder sb =new StringBuilder();

	static private class Pos {
		int x;
		int y;

		Pos(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = 1;
		while (true) {
			N = Integer.parseInt(br.readLine());
			if (N == 0)
				break;
			map = new int[N][N];
			cost = new int[N][N];
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < N; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
					cost[i][j] = Integer.MAX_VALUE;
				}
			}
			cost[0][0] = map[0][0];
			bfs();
			sb.append("Problem ").append(testCase).append(": ").append(cost[N - 1][N - 1]).append("\n");
			testCase++;
		}
		System.out.println(sb);
	}

	private static void bfs() {
		Deque<Pos> queue = new ArrayDeque<>();
		queue.add(new Pos(0, 0));
		
		while (!queue.isEmpty()) {
			
			int nr, nc;		
			Pos pos = queue.poll();
			
			int r = pos.x;
			int c = pos.y;
			
			for (int i = 0; i < 4; i++) {
				nr = r + dx[i];
				nc = c + dy[i];
				
				if (!isRange(nr, nc))
					continue;
				
				if (cost[nr][nc] <= cost[r][c] + map[nr][nc])
					continue;
				
				cost[nr][nc] = cost[r][c] + map[nr][nc];
				queue.add(new Pos(nr, nc));
			}
		}
	}

	private static boolean isRange(int x, int y) {
		return x < 0 || y < 0 || x >= N || y >= N ? false : true;
	}

}