package basic.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CyclicallyRotateArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");
        long[] a = new long[n];
        for (int j = 0; j < n; j++) {
            a[j] = Long.parseLong(input[j]);
        }

        rotate(a, n);
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }

    public static void rotate(long[] arr, long n) {
        long x = arr[arr.length - 1], i;
        for (i = arr.length - 1; i > 0; i--)
            arr[(int) i] = arr[(int) (i - 1)];
        arr[0] = x;
    }
}
