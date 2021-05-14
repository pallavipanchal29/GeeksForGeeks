package basic.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IsIsogram {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(isIsogram(s));
    }

    static boolean isIsogram(String data) {
        int[] freq = new int[26];
        for (int i = 0; i < data.length(); i++) {
            if (freq[data.charAt(i) - 'a'] != 0)
                return false;
            else
                freq[data.charAt(i) - 'a']++;
        }
        return true;
    }
}
