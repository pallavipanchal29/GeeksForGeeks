package easy.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PangramChecking {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(checkPangram(str));
    }

    public static boolean checkPangram(String str) {
        char[] freq = new char[26];
        str = str.toLowerCase().replaceAll("\\s", "");
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i)))
                freq[str.charAt(i) - 'a']++;
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 0)
                return false;
        }
        return true;
    }
}
