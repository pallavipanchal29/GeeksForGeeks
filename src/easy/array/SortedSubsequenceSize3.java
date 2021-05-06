package easy.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SortedSubsequenceSize3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");
        int[] a = new int[n];
        for (int j = 0; j < n; j++) {
            a[j] = Integer.parseInt(input[j]);
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++)
            arr.add(a[i]);

        ArrayList<Integer> answers = find3Numbers(arr, n);
        if (answers.size() != 3)
            System.out.println("0");
        else {
            for (int i = 0; i < answers.size(); i++)
                System.out.print(answers.get(i) + " ");
        }
    }

    static ArrayList<Integer> find3Numbers(ArrayList<Integer> arr, int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(arr.get(0));
        int maxSoFar = ans.get(0);
        int count = 1;

        int i = 1;
        while (i < n) {
            if (arr.get(i) > maxSoFar) {
                if (count == 3) break;
                maxSoFar = arr.get(i);
                ans.add(maxSoFar);
                count++;
            }
            i++;
        }
        return ans;
    }
}
