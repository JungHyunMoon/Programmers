import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            
            if (i == arr.length - 1) {
                list.add(num);
                break;
            }

            if (num == arr[i+1]) {
                continue;
            }
            list.add(num);
        }
        
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}