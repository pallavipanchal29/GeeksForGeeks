package school;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ValueEqualToIndexValue {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");
        int[] a = new int[n];
        for (int j = 0; j < n; j++) {
            a[j] = Integer.parseInt(input[j]);
        }

        ArrayList<Integer> ans = valueEqualToIndex(a, n);
        if (ans.size() == 0) {
            System.out.println("Not Found");
        } else {
            for (Integer x : ans) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }

    private static ArrayList<Integer> valueEqualToIndex(int[] arr, int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] == i + 1)
                ans.add(arr[i]);
        }
        return ans;
    }
}
