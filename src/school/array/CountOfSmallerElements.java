package school.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountOfSmallerElements {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());
        long x = Long.parseLong(br.readLine());

        String[] input = br.readLine().split(" ");
        long[] a = new long[input.length];
        for (int j = 0; j < input.length; j++) {
            a[j] = Long.parseLong(input[j]);
        }

        System.out.println(countOfElements(a, n, x));
    }

    public static long countOfElements(long[] arr, long n, long x) {
        long count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= x)
                count++;
        }
        return count;
    }
}
