class Solution {
    boolean solution(String s) {
        String str = s.toLowerCase();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'p') {
                count ++;
            } else if (str.charAt(i) == 'y') {
                count--;
            }
        }
        
        return count == 0;
    }
}