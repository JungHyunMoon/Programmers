class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++){
            if(n % i == 0){
                answer+=i;
            }
        }
        return answer;
        
        // 모든 약수의 합은 n/2 + n 까지와 같다고 한다
        // int answer = 0;
        // for (int i = 1; i <= n / 2; i++){
        //     if(n % i == 0){
        //         answer+=i;
        //     }
        // }
        // return answer + 2;
    }
}