import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static int w, h;
	static int map[][];
	static int dx[] = { 0, 0, -1, 1, -1, -1, 1, 1 };
	static int dy[] = { -1, 1, 0, 0, -1, 1, -1, 1 }; // 8방향 탐색
	static boolean isVisited[][];
	static int island = 0;
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			st = new StringTokenizer(br.readLine());
			w = Integer.parseInt(st.nextToken());
			h = Integer.parseInt(st.nextToken());

			if (w == 0 && h == 0)
				break;

			map = new int[h][w];
			isVisited = new boolean[h][w];
			island = 0;// 섬 갯수 초기화

			for (int i = 0; i < h; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < w; j++)
					map[i][j] = Integer.parseInt(st.nextToken());
			} 

			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (map[i][j] == 1 && !isVisited[i][j]) {
						isVisited[i][j] = true;
						dfs(i, j); 
						island++;
					}
				}
			}

			System.out.println(island);

		}
	}

	static void dfs(int row, int col) {

		for (int d = 0; d < 8; d++) {
			int nx = row + dx[d];
			int ny = col + dy[d];

			if (nx < 0 || nx >= h || ny < 0 || ny >= w || map[nx][ny] == 0 || isVisited[nx][ny])
				continue;

			isVisited[nx][ny] = true;
			dfs(nx, ny);

		}
		return;
	}

}
