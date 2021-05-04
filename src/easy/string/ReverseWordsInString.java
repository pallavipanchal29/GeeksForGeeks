package easy.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseWordsInString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println(reverseWords(input));
    }

    static String reverseWords(String S) {
        StringBuilder answer = new StringBuilder();
        String[] temp = S.split("\\.");
        for (int i = temp.length - 1; i >= 0; i--) {
            answer.append(temp[i]);
            if (i != 0)
                answer.append(".");
        }
        return answer.toString();
    }
}
