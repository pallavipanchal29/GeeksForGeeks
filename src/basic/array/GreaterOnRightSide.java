package basic.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GreaterOnRightSide {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");
        int[] a = new int[n];
        for (int j = 0; j < n; j++) {
            a[j] = Integer.parseInt(input[j]);
        }

        nextGreatest(a, n);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    static void nextGreatest(int[] arr, int n) {
        int maxSoFar = arr[n - 1];
        arr[n - 1] = -1;

        for (int i = n - 2; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = maxSoFar;
            if (temp > maxSoFar)
                maxSoFar = temp;
        }
    }
}
