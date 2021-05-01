package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReplaceZeroByFive {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        System.out.println(convertfive(num));
    }

    private static int convertfive(int num) {
        String temp = Integer.toString(num);
        temp = temp.replace('0', '5');
        return Integer.parseInt(temp);
    }
}
