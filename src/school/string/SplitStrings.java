package school.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SplitStrings {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        List<String> ans = splitString(str);

        for (String val : ans) {
            if (val == "")
                System.out.println(-1);
            else
                System.out.println(val);
        }
    }

    static List<String> splitString(String S) {
        List<String> answer = new ArrayList<>();
        StringBuilder letters = new StringBuilder();
        StringBuilder numbers = new StringBuilder();
        StringBuilder special = new StringBuilder();

        for (int i = 0; i < S.length(); i++) {
            if (Character.isLetter(S.charAt(i)))
                letters.append(S.charAt(i));
            else if (Character.isDigit(S.charAt(i)))
                numbers.append(S.charAt(i));
            else
                special.append(S.charAt(i));
        }
        answer.add(letters.toString());
        answer.add(numbers.toString());
        answer.add(special.toString());
        return answer;
    }
}
