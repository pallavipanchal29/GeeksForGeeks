package easy.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class TopKFreqElements {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int[] a = new int[input.length];
        for (int j = 0; j < a.length; j++) {
            a[j] = Integer.parseInt(input[j]);
        }

        int k = Integer.parseInt(br.readLine());

        int[] answer = topK(a, k);
        for (int i = 0; i < answer.length; i++)
            System.out.print(answer[i] + " ");
    }

    public static int[] topK(int[] nums, int k) {
        int[] answer = new int[k];
        int index = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]))
                map.put(nums[i], map.get(nums[i]) + 1);
            else
                map.put(nums[i], 1);
        }

        List<Map.Entry<Integer, Integer>> list = new LinkedList<>(map.entrySet());

        Collections.sort(list, (o1, o2) -> {
            if (o1.getValue().equals(o2.getValue()))
                return o1.getKey().compareTo(o2.getKey());
            else
                return o1.getValue().compareTo(o2.getValue());
        });

        for (int i = list.size() - 1; i >= 0; i--) {
            if (k == 0) break;
            answer[index] = list.get(i).getKey();
            index++;
            k--;
        }
        return answer;
    }
}
