class Solution {
    public int solution(String s) {
    int answer = 0;

    for (int i = 0; i < s.length(); i++) {
      char first = s.charAt(i);
      int count = 0;
      for (int j = i; j < s.length(); j++) {
        char ch = s.charAt(j);
        if (ch == first) {
          count++;
        } else {
          count--;
        }

        if (count == 0) {
          answer++;
          i = j; // 현재까지 읽은 부분을 제외하고 다음 부분부터 다시 시작
          break;
        }

        if (j == s.length() - 1) {
          // 문자열이 끝에 도달한 경우, 마지막 문자열을 처리
          answer++;
          i = j;
        }
      }
    }

    return answer;
    }
}