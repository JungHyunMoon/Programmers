import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }

        List<Integer> clone = new ArrayList<>(list);
        Collections.sort(clone);

        list.remove(clone.get(0));

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        if (answer.length == 0) {
            answer = new int[]{-1};
        }

        return answer;
    }
}