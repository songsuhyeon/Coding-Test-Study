import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static int R, C, M;
	static int sum;
	static int[] dr = { -1, 0, 1, 0 }; // 상 좌 하 우
	static int[] dc = { 0, -1, 0, 1 }; // => 방향 바꾸기 : d = ( d + 2 ) % 4;
	static HashMap<Integer, Info> m = new HashMap<>();
	static Info[][] map;

	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		st = new StringTokenizer(br.readLine(), " ");
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		map = new Info[R + 2][C + 2];

		for (int i = 1; i <= M; i++) { // 상어 정보 입력 받기
			st = new StringTokenizer(br.readLine(), " ");
			int r, c, s, d, z;
			r = Integer.parseInt(st.nextToken()); // (r, c)는 상어의 위치
			c = Integer.parseInt(st.nextToken()); // (r, c)는 상어의 위치
			s = Integer.parseInt(st.nextToken()); // s는 속력
			d = Integer.parseInt(st.nextToken()); // d는 이동 방향
			z = Integer.parseInt(st.nextToken()); // z는 크기

			Info now = new Info(r, c, s, d, z, i);
			m.put(i, now);

			map[r][c] = now;
		}

		start(1);

	} // end of main

	private static void start(int cnt) { // 낚시 시작

//		System.out.println("cnt : " + cnt + "------------");
//		System.out.println("size : " + m.size());
//		System.out.println("sum : " + sum);
//		for (Info[] row : map) {
//			for (Info i : row) {
//				System.out.print(i == null ? 0 : i.z);
//				System.out.print(" ");
//			}
//			System.out.println();
//		}

		// 낚시꾼이 오른쪽 끝으로 오면 종료
		if (cnt > C || m.size() == 0) {
			System.out.println(sum);
			return;
		}

		// 상어 잡기
		for (int r = 1; r <= R; r++) {
			if (map[r][cnt] != null) {
				sum += map[r][cnt].z;

				// 상어 리스트에서 상어 삭제
				m.remove(map[r][cnt].key);
				break;
			}
		}

		// map 비우기
		for (int i = 0; i <= R; i++) {
			Arrays.fill(map[i], null);
		}

		Queue<Integer> q = new LinkedList<>();

		// 상어 이동
		for (int k : m.keySet()) {
			Info cur = m.get(k);

			// 상어가 이동하려고 하는 칸이 격자판의 경계를 넘는 경우,
			// 방향을 반대로 바꿔서 속력을 유지한채로 이동
			int speed = cur.s;

			while (speed > 0) {

				if (cur.d == 1 && cur.r <= 1) {
					cur.d = 2;
				} else if (cur.d == 2 && cur.r >= R) {
					cur.d = 1;
				} else if (cur.d == 3 && cur.c >= C) {
					cur.d = 4;
				} else if (cur.d == 4 && cur.c <= 1) {
					cur.d = 3;
				}
				
				switch (cur.d) {
				case 1:
					cur.r--;
					break;
				case 2:
					cur.r++;
					break;
				case 3:
					cur.c++;
					break;
				case 4:
					cur.c--;
					break;
				}
				speed--;

				
			}

//			int speed = cur.s;
//			if (cur.d == 0 || cur.d == 2)
//				speed %= R * 2;
//			else if (cur.d == 1 || cur.d == 3)
//				speed %= C * 2;
//
//			System.out.println("speed : " + speed);
//
//			for (int s = 0; s < speed; s++) {
//				int nr = cur.r + dr[cur.d];
//				int nc = cur.c + dc[cur.d];
//
//				if (nr <= 1 || nr >= R + 1 || nc <= 1 || nc >= C + 1) {
//					cur.r -= dr[cur.d];
//					cur.c -= dc[cur.d];
//
//					// 방향 변경
//					cur.d = (cur.d + 2) % 4;
//					continue;
//				}
//
//				cur.r = nr;
//				cur.c = nc;
//
//				m.put(k, cur);
//			}

			// 상어 넣기
			if (map[cur.r][cur.c] == null) {
				map[cur.r][cur.c] = cur;
			} else { // 한 칸에 상어가 2마리 이상인 경우, 크기 비교
				if (map[cur.r][cur.c].z < cur.z) {
					q.add(map[cur.r][cur.c].key);
					map[cur.r][cur.c] = cur;
				} else {
					q.add(cur.key);
				}
			}
		}

		while (!q.isEmpty()) {
			m.remove(q.poll());
		}

		// 다시 낚시 시작
		start(cnt + 1);
	}

	static class Info {
		int r;
		int c;
		int s;
		int d;
		int z;
		int key;

		public Info(int r, int c, int s, int d, int z, int key) {
			super();
			this.r = r; // (r, c)는 상어의 위치
			this.c = c; // (r, c)는 상어의 위치
			this.s = s; // s는 속력
			this.d = d; // d는 이동 방향
			this.z = z; // z는 크기
			this.key = key;
		}
	}

} // end of main
