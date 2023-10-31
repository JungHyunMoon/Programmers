class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = 0;
        while (true) {
            num += 1;
            if (n % num == 1) {
                answer = num;
                break;
            }
        }

        return answer;
    }
}