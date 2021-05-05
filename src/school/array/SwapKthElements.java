package school.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwapKthElements {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(" ");
        int n = Integer.parseInt(temp[0]);
        int k = Integer.parseInt(temp[1]);

        String[] input = br.readLine().split(" ");
        int[] a = new int[n];
        for (int j = 0; j < n; j++) {
            a[j] = Integer.parseInt(input[j]);
        }

        swapKth(a, n, k);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    static void swapKth(int[] arr, int n, int k) {
        int temp = arr[k - 1];
        arr[k - 1] = arr[n - k];
        arr[n - k] = temp;

    }
}
