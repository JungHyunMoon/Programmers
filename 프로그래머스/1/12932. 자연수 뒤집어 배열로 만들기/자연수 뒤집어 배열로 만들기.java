class Solution {
    public static long[] solution(long n) {
        long count = String.valueOf(n).length();
        long[] answer = new long[(int)count];
        String temp = String.valueOf(n);

        for (int i = 0; i < answer.length; i++){
            answer[i] = Long.parseLong(temp.substring((int)(count-1), (int)count));
            count--;
        }
        return answer;
    }
}