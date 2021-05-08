package school.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReversingVowels {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(modify(str));
    }

    static String modify(String s) {
        char[] temp = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (!isVowel(temp[i])) {
                i++;
                continue;
            }
            if (!isVowel(temp[j])) {
                j--;
                continue;
            }

            char t = temp[i];
            temp[i] = temp[j];
            temp[j] = t;
            i++;
            j--;
        }


        StringBuilder sb = new StringBuilder();
        for (int p = 0; p < temp.length; p++)
            sb.append(temp[p]);
        return sb.toString();
    }

    static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}
