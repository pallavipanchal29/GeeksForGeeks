package medium.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class MergeKSortedArrays {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t > 0) {
            int n = Integer.parseInt(br.readLine());
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = Integer.parseInt(br.readLine());
                }
            }
            ArrayList<Integer> arr = mergeArrays(a, n);
            for (int i = 0; i < n * n; i++) {
                System.out.print((arr.get(i) + " "));
            }
            System.out.println();
            t--;
        }

    }

    private static ArrayList<Integer> mergeArrays(int[][] a, int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                answer.add(a[i][j]);
            }
        }
        Collections.sort(answer);
        return answer;
    }
}
