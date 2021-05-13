package basic.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfNumbersInString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(findSum(s));
    }

    public static long findSum(String str) {
        String temp = "0";
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)))
                temp = temp + str.charAt(i);
            else {
                sum = sum + Integer.parseInt(temp);
                temp = "0";
            }
        }
        return sum + Integer.parseInt(temp);
    }
}
