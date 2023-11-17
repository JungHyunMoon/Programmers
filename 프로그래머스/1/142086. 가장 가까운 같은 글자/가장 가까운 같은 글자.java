class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        answer[0] = -1;
        for (int i = 1; i < s.length(); i++) {
            String targetStr = String.valueOf(s.charAt(i));
            String subStr = s.substring(0,i);
            if (!subStr.contains(targetStr)) {
                answer[i] = -1;
                continue;
            }
            int count = 1;
            for (int j = subStr.length() - 1; j >=0; j--) {
                if (targetStr.equals(String.valueOf(subStr.charAt(j)))) {
                    answer[i] = count;
                    break;
                }
                count++;
            }
        }
        return answer;
    }
}