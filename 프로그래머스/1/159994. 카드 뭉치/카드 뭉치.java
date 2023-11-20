import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String[] answer = new String[goal.length];
        Queue<String > queue1 = new LinkedList<>();
        for (String card : cards1) {
            queue1.offer(card);
        }
        Queue<String > queue2 = new LinkedList<>();
        for (String card : cards2) {
            queue2.offer(card);
        }

        for (int i = 0; i < goal.length; i++) {
            if (!queue1.isEmpty()) {
                if (queue1.peek().equals(goal[i])) {
                    answer[i] = queue1.poll();
                }
            }
            if (!queue2.isEmpty()) {
                if (queue2.peek().equals(goal[i])) {
                    answer[i] = queue2.poll();
                }
            }
        }

        if (Arrays.equals(goal, answer)) {
            return "Yes";
        } else {
            return "No";
        }
    }
}