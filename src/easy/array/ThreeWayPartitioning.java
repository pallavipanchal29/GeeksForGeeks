package easy.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThreeWayPartitioning {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] temp = br.readLine().split(" ");
        int a = Integer.parseInt(temp[0]);
        int b = Integer.parseInt(temp[1]);

        String[] input = br.readLine().split(" ");
        int[] arr = new int[n];
        for (int j = 0; j < n; j++) {
            arr[j] = Integer.parseInt(input[j]);
        }

        threeWayPartition(arr, a, b);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void threeWayPartition(int[] array, int a, int b) {
        int start = 0;
        int end = array.length - 1;

        for (int i = 0; i <= end; ) {
            if (array[i] < a) {
                int temp = array[start];
                array[start] = array[i];
                array[i] = temp;
                start++;
                i++;
            } else if (array[i] > b) {
                int temp = array[end];
                array[end] = array[i];
                array[i] = temp;
                end--;
            } else {
                i++;
            }
        }
    }
}
