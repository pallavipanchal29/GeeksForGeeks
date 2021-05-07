package basic.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class ChangeTheString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(modify(s));
    }

    static String modify(String s) {
        if (Character.isLowerCase(s.charAt(0)))
            return s.toLowerCase(Locale.ROOT);
        else
            return s.toUpperCase(Locale.ROOT);
    }
}
