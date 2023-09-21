class Solution {
    public String solution(String rsp) {
        String answer = "";
        String[] arr = rsp.split("");
        for(String i : arr) {
            if (i.equals("2")) {
                answer += 0;
            } else if (i.equals("0")) {
                answer += 5;
            } else {
                answer += 2;
            }
        }
        return answer;
    }
}