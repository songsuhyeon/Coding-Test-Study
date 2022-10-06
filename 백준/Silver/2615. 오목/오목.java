import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 4방향 탐색 : 우상, 우, 우하, 하 19 * 19 테두리 -> 21 * 21 * 4방향 * 7개돌 검색
 */
public class Main {
	public static int[][] m = new int[21][21]; // 배열의 경계 테두리

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 1; i <= 19; i++) {
			String line = br.readLine();
			for (int j = 1, index = 0; j <= 19; j++, index += 2) {
				m[i][j] = line.charAt(index);
			}
		}

		for (int r = 1; r <= 19; r++) { // 행
			for (int c = 1; c <= 19; c++) { // 열
				// 4방 탐색하면서 오목인지 확인
				if (m[r][c] == '0')
					continue; // 돌이 놓여있지 않으면 -> 다음 칸으로 이동
				int answerColor = complete(r, c);
				if (answerColor > 0) { // 오목 완성
					System.out.println(answerColor - '0');
					System.out.println(r + " " + c);
					return; // 프로그램 종료
				}
			}
		}
		System.out.println(0); // 아직 승부가 결정나지 않음
	} // end of main

	public static int[] dr = { -1, 0, 1, 1 }; // 우상, 우, 우하, 하
	public static int[] dc = { 1, 1, 1, 0 }; // 우상, 우, 우하, 하

	// (r, c) 좌표에서 시작하는 오목이 되었는지 확인하고,
	// 오목이면 돌 색상을 return ('1' : 검, '2' : 흰, 오목이 아니면 : 0)
	public static int complete(int r, int c) {
		int color = m[r][c];
		for (int i = 0; i < dc.length; i++) { // 4방 탐색
			if (m[r - dr[i]][c - dc[i]] == color)
				continue; // 오목 전칸은 다른 색이거나, '0'(공백)이거나, 바둑판 밖
			// 오목인지 확인
			if (m[r + dr[i]][c + dc[i]] != color 
					|| m[r + dr[i]*2][c + dc[i]*2] != color 
					|| m[r + dr[i]*3][c + dc[i]*3] != color
					|| m[r + dr[i]*4][c + dc[i]*4] != color)
				continue;  // 5칸 연속 5칸인지 확인 (현재 위치다음 돌부터 탐색)
			if(m[r+dr[i]*5][c+dc[i]*5] == color) continue;
			return color;  // 오목의 색상을 리턴, 여기까지 오면 오목 완성
		}
		return 0;  // 오목 아님
	} // end of complete
} // end of class
