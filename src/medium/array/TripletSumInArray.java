package medium.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TripletSumInArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] temp = br.readLine().split(" ");
        int n = Integer.parseInt(temp[0]);
        int x = Integer.parseInt(temp[1]);

        String[] input = br.readLine().split(" ");
        int[] a = new int[n];
        for (int j = 0; j < n; j++) {
            a[j] = Integer.parseInt(input[j]);
        }

        System.out.println(find3Numbers(a, n, x));
    }

    public static boolean find3Numbers(int[] A, int n, int X) {
        Arrays.sort(A);

        for (int i = 0; i < A.length - 2; i++) {
            int l = i + 1;
            int r = n - 1;

            while (l < r) {
                if (A[i] + A[l] + A[r] == X)
                    return true;
                else if (A[i] + A[l] + A[r] < X)
                    l++;
                else
                    r--;
            }
        }
        return false;
    }
}
