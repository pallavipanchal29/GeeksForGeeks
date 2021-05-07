package easy.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class IsAnagram {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        System.out.println(isAnagram(str1, str2));
    }

    public static boolean isAnagram(String a, String b) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            if (map.containsKey(a.charAt(i)))
                map.put(a.charAt(i), map.get(a.charAt(i)) + 1);
            else
                map.put(a.charAt(i), 1);
        }

        for (int i = 0; i < b.length(); i++) {
            if (map.containsKey(b.charAt(i)))
                map.put(b.charAt(i), map.get(b.charAt(i)) - 1);
            else
                map.put(b.charAt(i), 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() != 0)
                return false;
        }
        return true;
    }
}
