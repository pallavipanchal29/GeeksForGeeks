package basic.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DoublingTheValue {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        long b = Long.parseLong(br.readLine());

        String[] input = br.readLine().split(" ");
        long[] a = new long[n];
        for (int j = 0; j < n; j++) {
            a[j] = Long.parseLong(input[j]);
        }

        System.out.println(solve(n, a, b));
    }

    static long solve(int n, long[] A, long b) {
        for (int i = 0; i < n; i++) {
            if (A[i] == b) {
                b = b * 2;
            }
        }
        return b;
    }
}
