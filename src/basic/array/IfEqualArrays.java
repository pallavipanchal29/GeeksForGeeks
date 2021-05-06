package basic.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class IfEqualArrays {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");
        long[] a = new long[n];
        for (int j = 0; j < n; j++) {
            a[j] = Long.parseLong(input[j]);
        }

        String[] input1 = br.readLine().split(" ");
        long[] b = new long[n];
        for (int j = 0; j < n; j++) {
            b[j] = Long.parseLong(input1[j]);
        }
        System.out.println(check(a, b, n));
    }

    public static boolean check(long[] A, long[] B, int N) {
        HashMap<Long, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            if (map.containsKey(A[i]))
                map.put(A[i], map.get(A[i]) + 1);
            else
                map.put(A[i], 1);
        }

        for (int i = 0; i < B.length; i++) {
            if (map.containsKey(B[i]))
                map.put(B[i], map.get(B[i]) - 1);
            else
                map.put(B[i], 1);
        }
        for (Map.Entry<Long, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 0)
                return false;
        }
        return true;
    }
}
