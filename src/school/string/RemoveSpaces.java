package school.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RemoveSpaces {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(modify(s));
    }

    static String modify(String S) {
        S = S.replaceAll("\\s", "");
        return S;
    }
}
