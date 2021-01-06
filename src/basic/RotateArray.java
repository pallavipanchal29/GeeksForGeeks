package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RotateArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine());

        for (int i = 0; i < tests; i++) {
            String[] temp = br.readLine().split(" ");
            int N = Integer.parseInt(temp[0]);
            int D = Integer.parseInt(temp[1]);

            String[] input = br.readLine().split(" ");
            int[] a = new int[N];
            for (int j = 0; j < N; j++) {
                a[j] = Integer.parseInt(input[j]);
            }

            for (int j = 0; j < D; j++)
                leftRotatebyOne(a, N);


            for (int j = 0; j < a.length; j++) {
                System.out.print(a[j] + " ");
            }
            System.out.println();

        }

    }

    private static void leftRotatebyOne(int[] arr, int n) {
        int i, temp;
        temp = arr[0];
        for (i = 0; i < n - 1; i++)
            arr[i] = arr[i + 1];
        arr[n - 1] = temp;
    }


}
