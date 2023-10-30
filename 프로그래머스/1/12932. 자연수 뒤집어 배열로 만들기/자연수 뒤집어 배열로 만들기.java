class Solution {
    public static long[] solution(long n) {
        long count = 0;
        for (long i = n; i > 0; i/=10){
            count++;
        }
        long[] answer = new long[(int)count];
        String temp = String.valueOf(n);

        for (int i = 0; i < answer.length; i++){
            answer[i] = Long.valueOf(temp.substring((int)(count-1), (int)count));
            count--;
        }
        return answer;
    }
}