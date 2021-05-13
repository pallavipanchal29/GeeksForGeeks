package basic.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TripletsWithZeroSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");
        int[] a = new int[n];
        for (int j = 0; j < n; j++) {
            a[j] = Integer.parseInt(input[j]);
        }

        System.out.println(findTriplets(a, n));
    }

    public static boolean findTriplets(int[] arr, int n) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int l = i + 1;
            int r = n - 1;
            while (l < r) {
                if (arr[i] + arr[l] + arr[r] == 0)
                    return true;
                else if (arr[i] + arr[l] + arr[r] < 0)
                    l++;
                else
                    r--;
            }
        }
        return false;
    }
}
