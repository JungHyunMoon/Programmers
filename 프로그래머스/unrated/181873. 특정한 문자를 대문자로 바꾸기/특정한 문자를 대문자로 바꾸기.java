import java.util.*;

class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        if (my_string.contains(alp) == true) {
            answer = my_string.replace(alp, alp.toUpperCase());
        } else {
            answer = my_string;
        }
        return answer;
    }
}