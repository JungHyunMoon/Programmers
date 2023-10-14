class Solution {
    public int solution(int[] list) {
        int answer = 0;
        for (int i = 0; i < list.length; i++) {
            int num = list[i];
            while (true) {
                if (num == 1) {
                    break;
                }
                answer += 1;
                if (num % 2 == 0) {
                    num /= 2;
                } else if (num % 2 == 1) {
                    num -= 1;
                    num /= 2;
                }
            }
        }
        return answer;
    }
}