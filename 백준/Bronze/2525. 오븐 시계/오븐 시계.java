import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s);
		int h = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int cook = Integer.parseInt(br.readLine());
		
		h += (m + cook) / 60;
		m = (m + cook) % 60;
		
		if (h >= 24) {
			h = h - 24;
		}
				
		System.out.println(h + " " + m);
	}  // end of main
}   // end of class
