package easy.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwapClosestAndFarthestDigits {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        String s2 = br.readLine();
        swapDigits(s1, s2);
    }

    static void swapDigits(String n1, String n2) {
        char[] s1 = n1.toCharArray();
        char[] s2 = n2.toCharArray();

        //swap first digit of first number with last digit of second number
        char t = s1[0];
        s1[0] = s2[s2.length - 1];
        s2[s2.length - 1] = t;

        //swap last digit of first number with first digit of second number
        char p = s1[s1.length - 1];
        s1[s1.length - 1] = s2[0];
        s2[0] = p;

        for (int i = 0; i < s1.length; i++)
            System.out.print(s1[i]);
        System.out.print(" ");
        for (int i = 0; i < s2.length; i++)
            System.out.print(s2[i]);

    }
}
