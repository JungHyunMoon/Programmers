class Solution {
    public double solution(long n) {
        double answer = 0;
        for (int i = 0; i <= n; i++){
            if (n == 0){
                return 4;
            }
            
            if (Math.pow(i, 2) == n){
                answer = Math.pow((i+1), 2);
                return answer;
            } else {
                answer = -1;
            }
        }
        return answer;
    }
}