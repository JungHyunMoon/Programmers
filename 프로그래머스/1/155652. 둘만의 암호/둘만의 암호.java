class Solution {
    public String solution(String s, String skip, int index) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        alphabet = alphabet + alphabet;
        String answer = "";

        String[] skipList = skip.split("");
        for (int i = 0; i < skip.length(); i++) {
            alphabet = alphabet.replace(skipList[i], "");
        }

        for (int i = 0; i < s.length(); i++) {
            char targetWord = s.charAt(i);
            int targetIndex = alphabet.indexOf(targetWord) + index;

            // 인덱스가 범위를 벗어나면 알파벳을 추가해줌
            while (targetIndex < 0 || targetIndex >= alphabet.length()) {
                alphabet = alphabet + alphabet;
            }

            answer += alphabet.charAt(targetIndex);
        }

        return answer;
    }
}
