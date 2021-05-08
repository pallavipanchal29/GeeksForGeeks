package school.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        boolean ans = check(str);
        System.out.println(ans == true ? "YES" : "NO");
    }

    static Boolean check(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (!String.valueOf(s.charAt(i)).equals(String.valueOf(s.charAt(i + 1))))
                return false;
        }
        return true;
    }
}
