import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int[][] map;
	static int max = 0;
	static boolean[] visited;
	static int R, C;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());

		map = new int[R][C];
		for (int i = 0; i < R; i++) {
			String str = br.readLine(); // 1차원 배열 통째로 받기
			for (int j = 0; j < C; j++) {
				map[i][j] = str.charAt(j) - 'A';
			}
		}

		visited = new boolean['Z' + 1]; // A~Z만 사용 앞에는 버림 'A' = 65, 'Z' = 90

		// 시작점 출발
		max = 1;
		dfs(0, 0, 1, 1 << map[0][0]);
		System.out.println(max);

	} // end of main

	// (r행, c열 좌표, step : 현재까지 진행한 칸 수
	private static void dfs(int r, int c, int step, int visited) {

		if (max == 26)
			return;

		// 현재까지 step 수가 최대치인지 확인, 업데이트
		if (max < step)
			max = step;

		if (0 <= r - 1 && (visited & 1 << map[r - 1][c]) == 0) { // 상
			dfs(r - 1, c, step + 1, visited | 1 << map[r - 1][c]);
		}

		if (r + 1 < R && (visited & 1 << map[r + 1][c]) == 0) { // 하
			dfs(r + 1, c, step + 1, visited | 1 << map[r + 1][c]);
		}

		if (0 <= c - 1 && (visited & 1 << map[r][c - 1]) == 0) { // 좌
			dfs(r, c - 1, step + 1, visited | 1 << map[r][c - 1]);
		}

		if (c + 1 < C && (visited & 1 << map[r][c + 1]) == 0) { // 우
			dfs(r, c + 1, step + 1, visited | 1 << map[r][c + 1]);
		}

	}

} // end of class
