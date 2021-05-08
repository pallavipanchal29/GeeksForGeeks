package basic.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LongestSubstringWithOne {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine());
        for (int i = 0; i < tests; i++) {
            String str = br.readLine();
            System.out.println(count(str));
        }

    }

    public static int count(String s) {
        int maxLen = 0;
        int len = 0;
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '1') {
                len++;
                maxLen = Math.max(maxLen, len);
            } else {
                len = 0;
            }
        }
        return maxLen;
    }
}
