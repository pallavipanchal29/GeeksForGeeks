package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class KLargestElements {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(" ");
        int n = Integer.parseInt(temp[0]);
        int k = Integer.parseInt(temp[1]);

        String[] input = br.readLine().split(" ");
        int[] a = new int[n];
        for (int j = 0; j < n; j++) {
            a[j] = Integer.parseInt(input[j]);
        }

        int[] arr = kLargest(a, n, k);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static int[] kLargest(int[] arr, int n, int k) {
        int[] ans = new int[k];
        PriorityQueue<Integer> q = new PriorityQueue<>(n, Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            q.offer(arr[i]);
        }
        for (int i = 0; i < k; i++)
            ans[i] = q.poll();
        return ans;
    }
}
