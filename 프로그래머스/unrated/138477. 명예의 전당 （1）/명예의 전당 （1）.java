import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        List<Integer> announce = new ArrayList<>();
        List<Integer> honor = new ArrayList<>(k);
        for (int i = 0; i < score.length; i++) {
            if (i < k) {
                honor.add(score[i]);
                honor.sort(null);
                announce.add(honor.get(0));
                System.out.println(i + "회차");
            } else {
                if (score[i] > honor.get(0)) {
                    honor.set(0, score[i]);
                    honor.sort(null);
                }
                announce.add(honor.get(0));
            }
            
        }

        int[] answer = announce.stream()
                       .mapToInt(Integer::intValue)
                       .toArray();
        return answer;
    }
}