package basic.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberOfOccurance {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(" ");
        int n = Integer.parseInt(temp[0]);
        int x = Integer.parseInt(temp[1]);

        String[] input = br.readLine().split(" ");
        int[] a = new int[n];
        for (int j = 0; j < n; j++) {
            a[j] = Integer.parseInt(input[j]);
        }

        int count = count(a, n, x);
        System.out.println(count);
    }

    private static int count(int[] arr, int n, int x) {
        int ind = binarySearch(0, arr.length - 1, arr, x);
        if (ind == -1)
            return 0;

        int count = 1;
        int left = ind - 1;
        while (left >= 0 && arr[left] == x) {
            count++;
            left--;
        }

        int right = ind + 1;
        while (right < n && arr[right] == x) {
            count++;
            right++;
        }
        return count;
    }

    private static int binarySearch(int l, int r, int[] arr, int x) {
        if (l > r) return -1;

        int mid = l + (r - l) / 2;
        if (arr[mid] == x)
            return mid;

        else if (arr[mid] > x)
            return binarySearch(l, r - 1, arr, x);

        else
            return binarySearch(l + 1, r, arr, x);
    }
}
