import java.util.*;

class Solution {
    public int solution(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count >= 2) {
                list.add(i);
            }
        }
        int answer = list.size();
        for (int temp : list) {
            System.out.println(temp);
        }
        return answer;
    }
}