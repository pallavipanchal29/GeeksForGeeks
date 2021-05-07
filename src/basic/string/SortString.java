package basic.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SortString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine());
        for (int i = 0; i < tests; i++) {
            String str = br.readLine();
            PrintInSortedOrder(str);
        }
    }

    private static void PrintInSortedOrder(String str) {
        //Complete the code
    }
}
