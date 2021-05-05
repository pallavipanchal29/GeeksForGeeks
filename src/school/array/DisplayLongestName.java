package school.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DisplayLongestName {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");

        System.out.println(longest(input, input.length));
    }

    static String longest(String[] names, int n) {
        int len = -1;
        String longest = "";
        for (int i = 0; i < names.length; i++) {
            if (names[i].length() > len) {
                len = names[i].length();
                longest = names[i];
            }
        }
        return longest;
    }
}
