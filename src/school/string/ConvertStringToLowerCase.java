package school.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class ConvertStringToLowerCase {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(toLower(s));
    }

    static String toLower(String S) {
        return S.toLowerCase(Locale.ROOT);
    }
}
