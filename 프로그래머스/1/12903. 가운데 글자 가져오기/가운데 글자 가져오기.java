class Solution {
    public String solution(String s) {
        String answer = "";
        int center = s.length() / 2; // 홀수 5 면 2.5에 버림 2 => 중앙값
        if (s.length() % 2 == 0) {
            answer += s.charAt(center - 1);
            answer += s.charAt(center);
        } else {
            answer += s.charAt(center);
        }
        return answer;
    }
}