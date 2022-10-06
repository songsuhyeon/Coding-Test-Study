import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		
		System.out.println(fib(N));

	} // end of main

	public static int fib(int N) {
		if(N == 0) {
			return 0;
		}
		else if (N == 1) {
			return 1;
		}
		
		return fib(N-1) + fib(N-2);
	}
} // end of class