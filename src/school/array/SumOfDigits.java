package school.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfDigits {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        System.out.println(sumOfDigits(n));
    }

    static int sumOfDigits(int N) {
        int temp = N;
        int sum = 0;
        while (temp != 0) {
            int t = temp % 10;
            sum = sum + t;
            temp = temp / 10;
        }
        return sum;
    }
}
