class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] fn = new int[n+1];
        
        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                fn[i] = 0;
            } else if (i == 1) {
                fn[i] = 1;
            } else {
                fn[i] = (fn[i-1] + fn[i-2]) % 1234567;   
            }
        }
        
        answer = fn[n] % 1234567;
        return answer;
    }
}