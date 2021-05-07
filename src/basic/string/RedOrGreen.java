package basic.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RedOrGreen {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();
        System.out.println(RedOrGreen(N, s));
    }

    static int RedOrGreen(int N, String S) {
        int redCount = 0;
        int greenCount = 0;

        for (int i = 0; i < N; i++) {
            if (S.charAt(i) == 'R')
                redCount++;
            else
                greenCount++;
        }
        return Math.min(redCount, greenCount);
    }
}
