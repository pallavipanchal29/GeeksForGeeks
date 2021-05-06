package basic.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThirdLargestElement {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");
        int[] a = new int[n];
        for (int j = 0; j < n; j++) {
            a[j] = Integer.parseInt(input[j]);
        }

        System.out.println(thirdLargest(a, n));
    }

    static int thirdLargest(int[] a, int n) {
        if (n < 3) return -1;
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (a[i] > first) {
                third = second;
                second = first;
                first = a[i];
            } else if (a[i] > second) {
                third = second;
                second = a[i];
            } else if (a[i] > third)
                third = a[i];
        }
        return third;
    }
}
