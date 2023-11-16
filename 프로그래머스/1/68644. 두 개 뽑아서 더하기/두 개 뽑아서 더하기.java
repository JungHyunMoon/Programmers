import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int addNum = numbers[i] + numbers[j];
                if (!list.contains(addNum)) {
                    list.add(addNum);
                }
            }
        }
        list.sort(null);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}