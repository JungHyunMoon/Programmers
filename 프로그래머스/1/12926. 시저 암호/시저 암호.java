class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int ascii = (int)ch;
            System.out.println(ascii);
            if (ascii == 32){
                answer.append(" ");
            } else if (Character.isUpperCase(ch) && ascii + n > 90) {
                ascii -= 26;
                answer.append((char)(ascii + n));
            } else if (Character.isLowerCase(ch) && ascii + n > 122) {
                ascii -= 26;
                answer.append((char)(ascii + n));
            } else {
                answer.append((char)(ascii + n));
            }

        }
        return answer.toString();
    }
}