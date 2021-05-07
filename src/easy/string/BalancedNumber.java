package easy.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BalancedNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        boolean ans = balancedNumber(s);
        System.out.println(ans == true ? 1 : 0);
    }

    static Boolean balancedNumber(String N) {
        int leftSum = 0;
        int rightSum = 0;

        int i = 0;
        int j = N.length() - 1;
        while (i < j) {
            leftSum = leftSum + Integer.parseInt(String.valueOf(N.charAt(i)));
            rightSum = rightSum + Integer.parseInt(String.valueOf(N.charAt(j)));
            i++;
            j--;
        }
        return leftSum == rightSum;
    }
}
