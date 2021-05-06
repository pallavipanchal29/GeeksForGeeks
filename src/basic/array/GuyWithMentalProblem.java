package basic.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GuyWithMentalProblem {
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

        System.out.println(minTime(a, b, n));
    }

    public static long minTime(long[] a, long[] b, long n) {
        long minTime = 0;
        int i = 0;
        long time1 = 0;
        long time2 = 0;
        boolean s = false;

        while (i < n) {
            if (!s) {
                time1 = time1 + a[i];
            } else
                time1 = time1 + b[i];
            s = !s;
            i++;
        }
        i = 0;
        s = false;
        while (i < n) {
            if (!s) {
                time2 = time2 + b[i];
            } else
                time2 = time2 + a[i];
            s = !s;
            i++;
        }
        minTime = Math.min(time1, time2);
        return minTime;

    }
}
