package basic.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RemoveConsecutiveCharacters {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(removeConsecutiveCharacter(str));
    }

    public static String removeConsecutiveCharacter(String S) {
        StringBuilder res = new StringBuilder();
        res.append(S.charAt(0));
        for (int i = 1; i < S.length(); i++) {
            if (!String.valueOf(S.charAt(i)).equals(String.valueOf(S.charAt(i - 1))))
                res.append(S.charAt(i));
        }

        return res.toString();
    }
}
