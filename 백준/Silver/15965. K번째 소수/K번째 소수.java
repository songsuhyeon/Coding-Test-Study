import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static int K;
	final static int SIZE = 10000001;
	static boolean[] isPrime;

	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		K = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> primes = new ArrayList<>();
		isPrime = new boolean[SIZE];
		isPrime[0] = isPrime[1] = true;
		for (int i = 2; i <= Math.sqrt(SIZE); i++) {
			if (isPrime[i]) {
				continue;
			}

			for (int j = i + i; j < SIZE; j += i) {
				isPrime[j] = true;
			}
		}
		
		for (int i = 2; i < SIZE; i++) {
			if(!isPrime[i])
				primes.add(i);
		}

		System.out.println(primes.get(K-1));
	}

}
