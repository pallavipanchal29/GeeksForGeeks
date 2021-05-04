package basic.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class RemoveCharacter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        System.out.println(removeChars(a, b));
    }

    static String removeChars(String string1, String string2) {
        StringBuilder sb = new StringBuilder();
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < string2.length(); i++) {
            set.add(string2.charAt(i));
        }
        for (int i = 0; i < string1.length(); i++) {
            if (!set.contains(string1.charAt(i)))
                sb.append(string1.charAt(i));
        }
        return sb.toString();
    }
}
