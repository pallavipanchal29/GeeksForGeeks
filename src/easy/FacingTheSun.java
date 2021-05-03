package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FacingTheSun {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");
        int[] a = new int[n];
        for (int j = 0; j < n; j++) {
            a[j] = Integer.parseInt(input[j]);
        }

        System.out.println(countBuildings(a, n));
    }

    static int countBuildings(int[] h, int n) {
        int count = 1;
        int maxSofar = h[0];
        for (int i = 1; i < n; i++) {
            if (h[i] >= maxSofar) {
                maxSofar = h[i];
                count++;
            }
        }
        return count;
    }
}
