package basic.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumArrayPuzzle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");
        int[] a = new int[n];
        for (int j = 0; j < n; j++) {
            a[j] = Integer.parseInt(input[j]);
        }

        SumArray(a, n);

    }

    public static void SumArray(int[] arr, int n) {
        int[] sum = new int[n];
        int index = 0;
        while (index < n) {
            for (int i = 0; i < n; i++) {
                if (i == index) continue;
                sum[index] = sum[index] + arr[i];
            }
            index++;
        }
        for (int i = 0; i < sum.length; i++)
            System.out.print(sum[i] + " ");
    }
}
