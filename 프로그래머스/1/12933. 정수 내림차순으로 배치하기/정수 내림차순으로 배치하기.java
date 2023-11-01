import java.util.*;

class Solution {
    public long solution(long n) {
        String answer = "";
        String[] list = String.valueOf(n).split("");
        Arrays.sort(list, Collections.reverseOrder());

        for (String str : list) {
            answer += str;
        }
        return Long.parseLong(answer);
    }
}