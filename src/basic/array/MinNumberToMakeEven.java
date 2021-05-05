package basic.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinNumberToMakeEven {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        long[] a = new long[input.length];
        for (int j = 0; j < input.length; j++) {
            a[j] = Long.parseLong(input[j]);
        }

        System.out.println(minNum(a, n));
    }

    static long minNum(long[] A, int N) {
        long sum = 0;
        for (int i = 0; i < N; i++) {
            sum = sum + A[i];
        }
        if (sum % 2 == 0)
            return 2;
        else return 1;
    }
}
