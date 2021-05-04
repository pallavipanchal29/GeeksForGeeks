package easy.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SortArrayOfZeroOneTwo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");
        int[] a = new int[n];
        for (int j = 0; j < n; j++) {
            a[j] = Integer.parseInt(input[j]);
        }

        sort012(a, n);

        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }

    public static void sort012(int[] a, int n) {
        int cnt0 = 0;
        int cnt1 = 0;
        int cnt2 = 0;

        for (int i = 0; i < n; i++) {
            switch (a[i]) {
                case 0:
                    cnt0++;
                    break;
                case 1:
                    cnt1++;
                    break;
                case 2:
                    cnt2++;
                    break;
            }
        }

        int i = 0;
        while (cnt0 > 0) {
            a[i++] = 0;
            cnt0--;
        }
        while (cnt1 > 0) {
            a[i++] = 1;
            cnt1--;
        }
        while (cnt2 > 0) {
            a[i++] = 2;
            cnt2--;
        }
    }
}
