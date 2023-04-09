import java.util.ArrayList;

class Solution {
    public String solution(int n) {
        ArrayList<String> StringList = new ArrayList<String>(n);
        for (int i = 0; i < n; i++) {
            if (i % 2 == 1) {
                StringList.add("박");
            } else {
                StringList.add("수");
            }
        }
        String answer = String.join(",", StringList).replaceAll(",", "");
        return answer;
    }
}