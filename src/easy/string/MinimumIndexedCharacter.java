package easy.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinimumIndexedCharacter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String pat = br.readLine();
        System.out.println(minIndexChar(str, pat));
    }

    public static int minIndexChar(String str, String patt) {
        int minSoFar = Integer.MAX_VALUE;
        for (int i = 0; i < str.length(); i++) {
            if (patt.contains(String.valueOf(str.charAt(i)))) {
                minSoFar = Math.min(minSoFar, i);
            }
        }
        return minSoFar == Integer.MAX_VALUE ? -1 : minSoFar;
    }
}
