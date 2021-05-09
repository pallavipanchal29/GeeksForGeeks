package easy.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PatternSearching {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();
        String pat = br.readLine();
        System.out.println(search(text, pat));
    }

    static int search(String text, String pat) {
        boolean ans = text.contains(pat);
        return ans == true ? 1 : 0;
    }
}
