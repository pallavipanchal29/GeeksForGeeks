package school.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(revStr(s));
    }

    static String revStr(String S) {
        StringBuilder rev = new StringBuilder();
        int i = 0;
        int j = S.length() - 1;
        char[] temp = S.toCharArray();

        while (i < j) {
            char t = temp[i];
            temp[i] = temp[j];
            temp[j] = t;
            i++;
            j--;
        }

        for (int p = 0; p < temp.length; p++) {
            rev.append(temp[p]);
        }
        return rev.toString();
    }
}
