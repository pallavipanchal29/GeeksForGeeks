package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BitonicPoint {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");
        int[] a = new int[n];
        for (int j = 0; j < n; j++) {
            a[j] = Integer.parseInt(input[j]);
        }

        System.out.println(findMaximum(a, n));
    }

    static int findMaximum(int[] arr, int n) {
        int ind = binarySearch(arr, 1, n - 2);
        return arr[ind + 1];
    }

    static int binarySearch(int[] arr, int l, int r) {
        if (l > r)
            return 0;
        int mid = l + (r - l) / 2;

        if (arr[mid - 1] < arr[mid] && arr[mid + 1] > arr[mid])
            return mid;

        if (arr[mid] < arr[mid + 1])
            return binarySearch(arr, mid + 1, r);
        else
            return binarySearch(arr, l, mid - 1);
    }
}
