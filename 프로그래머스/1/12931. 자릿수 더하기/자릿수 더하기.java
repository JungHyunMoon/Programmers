import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        String[] arr = String.valueOf(n).split("");
        for (String str : arr) {
            answer += Integer.parseInt(str);
        }

        return answer;
    }
}