class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int lastIndex = t.length() - p.length() + 1;

        for (int i = 0; i < lastIndex; i++) {
            String target = t.substring(i, i + p.length());
            if (Long.parseLong(target) <= Long.parseLong(p)) {
                answer++;
            }

        }

        return answer;
    }
}