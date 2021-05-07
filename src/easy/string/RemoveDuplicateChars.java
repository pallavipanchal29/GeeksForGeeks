package easy.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RemoveDuplicateChars {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        System.out.println(removeDuplicates(s));
    }

    static String removeDuplicates(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (!result.toString().contains(String.valueOf(str.charAt(i))))
                result.append(str.charAt(i));
        }
        return result.toString();
    }
}
