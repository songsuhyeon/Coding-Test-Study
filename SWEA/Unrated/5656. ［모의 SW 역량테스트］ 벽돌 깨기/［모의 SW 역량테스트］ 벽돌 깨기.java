import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Solution {

	static int T, N, W, H, min;
	static int[][] map, newMap;
	static int[] dr = { -1, 1, 0, 0 };
	static int[] dc = { 0, 0, -1, 1 };

	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());

		for (int testCase = 1; testCase <= T; testCase++) {
			st = new StringTokenizer(br.readLine(), " ");
			N = Integer.parseInt(st.nextToken());
			W = Integer.parseInt(st.nextToken());
			H = Integer.parseInt(st.nextToken());

			map = new int[H][W];
			for (int i = 0; i < H; i++) {
				st = new StringTokenizer(br.readLine(), " ");
				for (int j = 0; j < W; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}

			min = Integer.MAX_VALUE;
			go(map, 0);

			sb.append("#").append(testCase).append(" ").append(min).append("\n");
		} // end of testCase
		System.out.println(sb);
	} // end of main

	// 구슬 던지기 게임 시작
	private static void go(int[][] map, int cnt) { // map : 직전 구슬까지 던진 상태의 배열
		if (cnt == N) { // 구슬을 다 던진 상태
			// 남은 벽돌 수만큼 카운트 최소값 갱신
			int result = getRemain(map);
			if (min > result)
				min = result;
			return;
		}

		// 구슬 던지기 (중복 순열)
		int[][] newMap = new int[H][W];
		for (int c = 0; c < W; c++) {
			// 구슬에 맞는 시작 벽돌 찾기
			int r = 0;
			while (r < H && map[r][c] == 0)
				++r; // 빈 칸이면 행 증가

			if (r == H) { // 맞는 시작 벽돌이 없는 상태
				go(map, cnt + 1);
			} else { // 맞는 시작벽돌이 있는 상태
				copy(map, newMap);
				// 제거될 벽돌 연쇄 처리
				boom(newMap, r, c);
				// 벽돌 중력 처리
				down(newMap);
				// 다음 구슬 던지기
				go(newMap, cnt + 1);
			}
		}
	} // end of go

	private static int getRemain(int[][] map) {
		int result = 0;
		for (int r = 0; r < H; r++) {
			for (int c = 0; c < W; c++) {
				if (map[r][c] > 0)
					result++;
			}
		}
		return result;
	}

	static Stack<Integer> stack = new Stack<Integer>();

	private static void down(int[][] map) {
		for (int c = 0; c < W; c++) {
			// 윗행부터 남은 벽돌 스택에 넣기
			for (int r = 0; r < H; r++) {
				if (map[r][c] > 0) {
					stack.push(map[r][c]);
					map[r][c] = 0;
				}
			} // 남은 벽돌은 스택에 들어있고 모든 칸은 빈칸 상태
			int nr = H - 1;
			while(!stack.isEmpty()) {
				map[nr--][c] = stack.pop();
			}
		}
	} // end of down

	private static void boom(int[][] map, int r, int c) { // bfs
		Queue<Point> q = new ArrayDeque<>();
		// 벽돌이 있던 자리를 0으로 변경 : 빈칸으로 만들어서 방문처리

		if (map[r][c] > 1) {
			q.offer(new Point(r, c, map[r][c]));
		}
		map[r][c] = 0; // 방문처리 ===> 제거처리

		while (!q.isEmpty()) {
			Point p = q.poll(); // 주변에 영향을 주는 벽돌 정보

			// 벽돌의 크기 -1 만큼 주변 벽돌(4방) 연쇄 처리
			for (int i = 0; i < 4; i++) {
				int nr = p.r;
				int nc = p.c;
				for (int j = 1; j < p.cnt; j++) { // 현재 방향에서 cnt - 1 벽돌 보기
					nr += dr[i];
					nc += dc[i];

					if (nr >= 0 && nr < H && nc >= 0 && nc < W && map[nr][nc] > 0) {
						if (map[nr][nc] > 1) {
							q.offer(new Point(nr, nc, map[nr][nc]));
						}
						map[nr][nc] = 0; // 방문처리 ===> 제거처리
					}
				}
			}
		}
	} // end of boom

	private static void copy(int[][] map, int[][] newMap) {
		for (int r = 0; r < H; r++) {
			for (int c = 0; c < W; c++) {
				newMap[r][c] = map[r][c];
			}
		}
	}

	static class Point {
		int r;
		int c;
		int cnt;

		public Point(int r, int c, int cnt) {
			super();
			this.r = r;
			this.c = c;
			this.cnt = cnt;
		}
	}

} // end of class
