package basic.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ImplementStrStr {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String x = br.readLine();
        System.out.println(strstr(s, x));
    }

    static int strstr(String s, String x) {
        int index = -1;
        int j = 0;
        int i = 0;

        while (i < s.length()) {
            if (j == x.length()) return index;
            if (j < x.length() && s.charAt(i) == x.charAt(j)) {
                if (index == -1) index = i;
                j++;
            } else {
                j = 0;
                index = -1;
            }
            i++;
        }
        return index;
    }
}
