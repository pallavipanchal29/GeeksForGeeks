package easy.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EquilibriumPointIndex {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine());

        for (int i = 0; i < tests; i++) {
            int n = Integer.parseInt(br.readLine());
            String[] input = br.readLine().split(" ");
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = Integer.parseInt(input[j]);
            }

            System.out.println(findEquilibrium(a, n));
        }

    }

    static int findEquilibrium(int[] A, int n) {

        int sum = 0;
        int leftSum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + A[i];
        }
        for (int i = 0; i < n; i++) {
            sum = sum - A[i];
            if (sum == leftSum)
                return i;

            leftSum = leftSum + A[i];
        }

        return -1;
    }
}
