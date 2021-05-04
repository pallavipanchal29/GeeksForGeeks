package easy.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println(isPlaindrome(input));
    }

    static int isPlaindrome(String S) {
        int i = 0;
        int j = S.length() - 1;
        while (i < j) {
            if (S.charAt(i) != S.charAt(j))
                return 0;
            i++;
            j--;
        }
        return 1;
    }
}
