package basic.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaximunTripletSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");
        int[] a = new int[n];
        for (int j = 0; j < n; j++) {
            a[j] = Integer.parseInt(input[j]);
        }

        System.out.println(maxTripletSum(a, n));
    }

    static int maxTripletSum(int[] a, int n) {
        int maxA = Integer.MIN_VALUE;
        int maxB = Integer.MIN_VALUE;
        int maxC = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (a[i] > maxA) {
                maxC = maxB;
                maxB = maxA;
                maxA = a[i];

            } else if (a[i] < maxA && a[i] > maxB) {
                maxC = maxB;
                maxB = a[i];
            } else if (a[i] < maxA && a[i] < maxB && a[i] > maxC) {
                maxC = a[i];
            }
        }
        return maxA + maxB + maxC;
    }
}
