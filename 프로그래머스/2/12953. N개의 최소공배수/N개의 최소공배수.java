import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        for (int i =0; i < arr.length-1; i++) {
            int small = arr[i];
            int big = arr[i+1];
            while(true) {
                if(arr[i] == arr[i+1]) {
                    break;
                }
                if(arr[i] < arr[i+1]) {
                    arr[i] += small;
                } else {
                    arr[i+1] += big;
                }
            }
        }
        return arr[arr.length-1];
    }
}