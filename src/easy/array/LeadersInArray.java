package easy.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class LeadersInArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");
        int[] a = new int[n];
        for (int j = 0; j < n; j++) {
            a[j] = Integer.parseInt(input[j]);
        }
        ArrayList<Integer> answers = leaders(a, n);
        for (int i = answers.size() - 1; i >= 0; i--) {
            System.out.print(answers.get(i) + " ");
        }
    }

    static ArrayList<Integer> leaders(int[] arr, int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        int maxSoFar = arr[n - 1];
        answer.add(maxSoFar);
        for (int i = n - 2; i > 0; i--) {
            if (arr[i] >= maxSoFar) {
                maxSoFar = arr[i];
                answer.add(maxSoFar);
            }
        }
        Collections.reverse(answer);
        return answer;
    }
}
