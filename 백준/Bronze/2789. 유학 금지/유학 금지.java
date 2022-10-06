import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();

		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'C' || s.charAt(i) == 'A' || s.charAt(i) == 'M' || s.charAt(i) == 'B' || s.charAt(i) == 'R' ||s.charAt(i) == 'I' ||s.charAt(i) == 'D' ||s.charAt(i) == 'G' ||s.charAt(i) == 'E') {
				continue;
			}
			System.out.print(s.charAt(i));
		}
	
	
	}
}
