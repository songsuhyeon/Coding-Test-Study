import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

	static int N, M;
	static LinkedList<Info> list = new LinkedList<Info>();

	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		M = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < M; i++) {
			
			int n = Integer.parseInt(st.nextToken());

			// 후보 수 <= N
			if (list.size() < N) {
				boolean check = false;
				for (int j = 0; j < list.size(); j++) {
					list.get(j).time++;
					if(list.get(j).num == n) {
						list.get(j).cnt++; // 리스트에 n이 있는 경우 : 추천 횟수 증가
						check = true;
					}
				}

				if (!check) {  // 리스트에 n이 없는 경우 : 추가
					list.add(new Info(n, 1, 1));
				} 

			} else { // 후보 수 > N
				Collections.sort(list);
				boolean check = false;
				for (int j = 0; j < list.size(); j++) {
					list.get(j).time++;
					if(list.get(j).num == n) {
						list.get(j).cnt++; // 리스트에 n이 있는 경우 : 추천 횟수 증가
						check = true;
					}
				}

				if (!check) {  // 리스트에 n이 없는 경우 : 기존 후보 삭제 -> 추가
					list.remove(0);
					list.add(new Info(n, 1, 1));
				} 
			}
	
		}
		
		Collections.sort(list, new Comparator<Info>() {
			@Override
			public int compare(Info o1, Info o2) {
				return o1.num - o2.num;
			}
		});
		
		for (Info info : list) {
			sb.append(info.num).append(" ");
		}
		System.out.println(sb);
	}

	static class Info implements Comparable<Info>{
		int num = 0;
		int cnt = 0; // 추천 횟수
		int time = 0; // 게시된 시간

		public Info(int num, int cnt, int time) {
			super();
			this.num = num;
			this.cnt = cnt;
			this.time = time;
		}

		@Override
		public int compareTo(Info o) {
			if(this.cnt == o.cnt) {
				return o.time - this.time;
			}
			return this.cnt - o.cnt;
		}


	}

}
