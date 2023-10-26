class Solution {
    public long[] solution(long n) {
//         long count = 0;
//         for (long i = n; i > 0; i/=10){
//             count++;
//         }
//         long[] answer = new long[(int)count];
//         String temp = String.valueOf(n);
        
//         for (int i = 0; i < answer.length; i++){
//             answer[i] = Long.valueOf(temp.substring((int)(count-1), (int)count));
//             count--;
//         }
//         return answer;
                int size = String.valueOf(n).length();
        long[] answer = new long[size];

        String[] list = String.valueOf(n).split("");
        for (int i = 0; i < list.length/2; i++) {
            int oppositeIndex = size - 1 - i;
            String opposite = list[oppositeIndex];
            list[oppositeIndex] = list[i];
            list[i] = opposite;
        }

        for (int i = 0; i < list.length; i++) {
            answer[i] = Long.parseLong(list[i]);
        }

        return answer;
    }
}