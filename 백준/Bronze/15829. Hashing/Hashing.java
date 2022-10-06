import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();

        long res = 0;
        for (int i = 0; i < N; i++) {
            res += Math.pow(31,i) * ((s.charAt(i)-'a')+1);
        }

        System.out.println(res%Integer.MAX_VALUE);

    } // end of main

} // end of class
