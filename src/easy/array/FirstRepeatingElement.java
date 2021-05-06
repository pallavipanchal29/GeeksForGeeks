package easy.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class FirstRepeatingElement {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");
        int[] a = new int[n];
        for (int j = 0; j < n; j++) {
            a[j] = Integer.parseInt(input[j]);
        }

        System.out.println(firstRepeated(a, n));
    }

    public static int firstRepeated(int[] arr, int n) {
        int min = -1;
        HashSet<Integer> set = new HashSet<>();
        for (int i = n - 1; i >= 0; i--) {
            if (set.contains(arr[i]))
                min = i;
            else
                set.add(arr[i]);
        }
        return min == -1 ? -1 : (min + 1);
    }
}
