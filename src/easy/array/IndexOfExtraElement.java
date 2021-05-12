package easy.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IndexOfExtraElement {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");
        int[] a = new int[input.length];
        for (int j = 0; j < input.length; j++) {
            a[j] = Integer.parseInt(input[j]);
        }

        String[] input2 = br.readLine().split(" ");
        int[] b = new int[input2.length];
        for (int j = 0; j < input2.length; j++) {
            b[j] = Integer.parseInt(input2[j]);
        }

        System.out.println(findExtra(a, b, n));
    }

    static int findExtra(int[] a, int[] b, int n) {
        int index = n;

        int left = 0, right = n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (a[mid] == b[mid])
                left = mid + 1;
            else {
                index = mid;
                right = mid - 1;
            }
        }
        return index;
    }
}
