import java.util.*;
class Solution {
    public int[] solution(String s) {
		int[] answer = {0,0};
		while (s.length() != 1) {
			answer[1] += zeroCount(s);
			s = change(s, 2);
			answer[0] +=1;
		}
        return answer;
    }
    
    public static int zeroCount(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '0') {
				count++;
			}
		}
		
		return count;
	}
	
    public static String change(String s, int n) {
        s = s.replaceAll("0", "");
        String bs = Integer.toString(s.length(), n);
        return bs;
    }
        
}