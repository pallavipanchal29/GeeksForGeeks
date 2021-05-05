package basic.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BalancedArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        long[] a = new long[input.length];
        for (int j = 0; j < input.length; j++) {
            a[j] = Long.parseLong(input[j]);
        }

        System.out.println(minValueToBalance(a, n));
    }

    static long minValueToBalance(long[] a, int n) {
        long leftSum = 0;
        long rightSum = 0;
        int t = n / 2;
        for (int i = 0; i < t; i++) {
            leftSum = leftSum + a[i];
        }
        for (int i = t; i < n; i++) {
            rightSum = rightSum + a[i];
        }
        return Math.abs(leftSum - rightSum);
    }
}
