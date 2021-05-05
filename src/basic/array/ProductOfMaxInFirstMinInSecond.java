package basic.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProductOfMaxInFirstMinInSecond {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int[] a = new int[input.length];
        for (int j = 0; j < input.length; j++) {
            a[j] = Integer.parseInt(input[j]);
        }

        String[] input2 = br.readLine().split(" ");
        int[] b = new int[input2.length];
        for (int j = 0; j < input2.length; j++) {
            b[j] = Integer.parseInt(input2[j]);
        }

        System.out.println(find_multiplication(a, b, a.length, b.length));
    }

    public static long find_multiplication(int[] arr, int[] brr, int n, int m) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        for (int i = 0; i < brr.length; i++) {
            min = Math.min(min, brr[i]);
        }
        return max * min;
    }
}
