import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        for (int i = 0; i < k; i++) {
            answer[i] = -1;
        }
        int count = 0;
        StringBuilder sb = new StringBuilder();
        Set<Integer> history = new HashSet<>();
        for (int num : arr) {
            if (count == k) {
                break;
            }
            if (history.contains(num) == false) {
                answer[count] = num;
                history.add(num);
                count++;
            }
            
        }
        return answer;
    }
}