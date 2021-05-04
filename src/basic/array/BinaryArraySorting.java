package basic.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryArraySorting {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");
        int[] a = new int[n];
        for (int j = 0; j < n; j++) {
            a[j] = Integer.parseInt(input[j]);
        }

        int[] ans = SortBinaryArray(a, n);
        for (int i = 0; i < ans.length; i++) {
            System.out.print((ans[i] + " "));
        }
    }

    static int[] SortBinaryArray(int[] arr, int n) {
        int[] ans = new int[n];
        int countZero = 0;
        int countOne = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                countZero++;
            else
                countOne++;
        }

        for (int i = 0; i < countZero; i++)
            ans[i] = 0;
        for (int i = countZero; i < n; i++)
            ans[i] = 1;
        return ans;
    }
}
