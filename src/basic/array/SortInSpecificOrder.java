package basic.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SortInSpecificOrder {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");
        long[] a = new long[n];
        for (int j = 0; j < n; j++) {
            a[j] = Long.parseLong(input[j]);
        }

        sortIt(a, n);
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }

    public static void sortIt(long[] arr, long n) {
        for (int i = 0; i < n; i++) {
            if ((arr[i] & 1) != 0)
                arr[i] = arr[i] * -1;
        }
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            if ((arr[i] & 1) != 0)
                arr[i] = arr[i] * -1;
        }
    }
}
