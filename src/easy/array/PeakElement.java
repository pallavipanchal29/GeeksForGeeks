package easy.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PeakElement {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");
        int[] a = new int[n];
        for (int j = 0; j < n; j++) {
            a[j] = Integer.parseInt(input[j]);
        }

        System.out.println(peakElement(a, n));
    }

    public static int peakElement(int[] arr, int n) {
        return binarySearch(arr, 0, n - 1, n);
    }

    private static int binarySearch(int[] arr, int l, int r, int n) {
        int mid = l + (r - l) / 2;
        if (mid == 0 || arr[mid] >= arr[mid - 1] || arr[mid] >= arr[mid + 1])
            return mid;
        else if (mid > 0 && arr[mid - 1] > arr[mid])
            return binarySearch(arr, l, (mid - 1), n);
        else
            return binarySearch(arr, (mid + 1), n - 1, n);
    }
}
