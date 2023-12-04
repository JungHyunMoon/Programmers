import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] splitS = s.split(" ");
        
        for (int i = 0; i < splitS.length; i++) {
            String word = splitS[i].toLowerCase();
            
            if (word.length() > 0) {
                char firstChar = Character.toUpperCase(word.charAt(0));
                answer.append(firstChar).append(word.substring(1));
            }
            
            if (i < splitS.length - 1) {
                answer.append(" ");
            }
        }
        
        int differ = s.length() - answer.length();
        if (differ > 0) {
            for (int i = 0; i < differ; i++) {
                answer.append(" ");
            }
        }
        
        return answer.toString();
    }
}
