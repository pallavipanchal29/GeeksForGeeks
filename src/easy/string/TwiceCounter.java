package easy.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class TwiceCounter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        System.out.println(countWords(input, input.length));
    }

    public static int countWords(String[] list, int n) {
        int count = 0;
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list.length; i++) {
            if (map.containsKey(list[i])) {
                map.put(list[i], map.get(list[i]) + 1);
            } else
                map.put(list[i], 1);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 2)
                count++;
        }
        return count;
    }
}
