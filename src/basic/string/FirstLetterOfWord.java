package basic.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstLetterOfWord {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println(firstAlphabet(input));
    }

    static String firstAlphabet(String S) {
        StringBuilder sb = new StringBuilder();

        String[] temp = S.split(" ");
        for (int i = 0; i < temp.length; i++) {
            sb.append(temp[i].charAt(0));
        }
        return sb.toString();
    }
}
