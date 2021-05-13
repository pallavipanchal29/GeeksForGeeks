package basic.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseSubArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] temp = br.readLine().split(" ");
        int L = Integer.parseInt(temp[0]);
        int R = Integer.parseInt(temp[1]);

        String[] input = br.readLine().split(" ");
        int[] a = new int[n];
        for (int j = 0; j < n; j++) {
            a[j] = Integer.parseInt(input[j]);
        }

        reverseSubArray(a, n, L, R);
        for (int i = 0; i < a.length; i++) {
            System.out.print((a[i] + " "));
        }
    }

    static void reverseSubArray(int[] arr, int n, int l, int r) {
        l = l - 1;
        r = r - 1;
        int i = 0;
        while (i < n) {
            if (i == l) {
                int left = l;
                int right = r;
                while (left < right) {
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left++;
                    right--;
                }
            }
            i++;
        }
    }
}
