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

	static int N, K, S, X, Y, num;
	static int[][] arr;
	static int[] dr = { -1, 1, 0, 0 };
	static int[] dc = { 0, 0, -1, 1 };
	static Queue<Pos> q = new LinkedList<>();

	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());

		arr = new int[N][N];

		ArrayList<Pos> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if (arr[i][j] != 0) {
					list.add(new Pos(i, j, arr[i][j]));
				}
			}
		}
		
		Collections.sort(list, new Comparator<Pos>() {
			@Override
			public int compare(Pos o1, Pos o2) {
				return o1.n - o2.n;
			}
		});
		
		for (Pos pos : list) {
			q.add(pos);
		}

		st = new StringTokenizer(br.readLine(), " ");
		S = Integer.parseInt(st.nextToken());
		X = Integer.parseInt(st.nextToken());
		Y = Integer.parseInt(st.nextToken());

		bfs();
		System.out.println(arr[X - 1][Y - 1]);
	}

	private static void bfs() {

		while(!q.isEmpty()) {
			int size = q.size();
			num++;
			if (num > S)
				return;

			for (int i = 0; i < size; i++) {
				Pos cur = q.poll();
				for (int j = 0; j < 4; j++) {

					int nr = cur.x + dr[j];
					int nc = cur.y + dc[j];

					if (check(nr, nc))
						continue;

					if (arr[nr][nc] == 0) {
						arr[nr][nc] = cur.n;
						q.add(new Pos(nr, nc, arr[nr][nc]));
					} 
				}

			}

			//p();
			
		}
		

	}

	private static void p() {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("----------------");

	}

	private static boolean check(int nr, int nc) {
		return nr < 0 || nr >= N || nc < 0 || nc >= N;
	}

	static class Pos {
		int x;
		int y;
		int n;

		public Pos(int x, int y, int n) {
			super();
			this.x = x;
			this.y = y;
			this.n = n;
		}
	}

}
