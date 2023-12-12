import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        int length = 0;

        while (length < elements.length) {
            for (int i = 0; i < elements.length; i++) {
                int sum = 0;
                for (int j = i; j <= i + length; j++) {
                    if (j >= elements.length) {
                        int target = elements[j - elements.length];
                        sum += elements[j - elements.length];
                        continue;
                    }
                    sum += elements[j];
                }
                set.add(sum);
            }
            length++;
        }


        answer = set.size();
        return answer;
    }
}