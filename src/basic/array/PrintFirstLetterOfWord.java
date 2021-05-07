package basic.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintFirstLetterOfWord {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(firstAlphabet(s));
    }

    static String firstAlphabet(String S) {
        StringBuilder sb = new StringBuilder();
        sb.append(S.charAt(0));
        char[] ch = S.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (Character.isSpaceChar(ch[i]) && (i + 1) < S.length())
                sb.append(ch[i + 1]);
        }
        return sb.toString();
    }
}
