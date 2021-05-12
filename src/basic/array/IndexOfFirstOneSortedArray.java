package basic.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IndexOfFirstOneSortedArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());

        String[] input = br.readLine().split(" ");
        long[] a = new long[(int) n];
        for (int j = 0; j < n; j++) {
            a[j] = Long.parseLong(input[j]);
        }

        System.out.println(firstIndex(a, n));
    }

    public static long firstIndex(long[] arr, long n) {
        return binarySearch(arr, 0, n - 1);
    }

    static long binarySearch(long[] arr, long l, long r) {
        while (l <= r) {

            long mid = (l + r) / 2;

            if (arr[(int) (mid)] == 1 && (mid == 0 || arr[(int) (mid - 1)] == 0))
                return mid;

            if (arr[(int) mid] == 0)
                l = mid + 1;
            else if (arr[(int) mid] == 1)
                r = mid - 1;

        }
        return -1;
    }
}
