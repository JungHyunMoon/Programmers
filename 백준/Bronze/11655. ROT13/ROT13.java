import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] charList = str.toCharArray();
        String answer = "";
        // 아스키 코드를 활용한 풀이
        for (int i = 0; i < str.length(); i++) {

            char ch = charList[i];
            if (Character.isUpperCase(ch)) {
                // 대문자
                int ASCII = (int)charList[i];
                char encodedChar = (char) (ASCII + 13);
                if (ASCII + 13 > 90) {
                    encodedChar = (char) (64 + (ASCII + 13 - 90));
                }
                answer += encodedChar;

            } else if (Character.isLowerCase(ch)){
                // 소문자
                int ASCII = (int)charList[i];
                char encodedChar = (char) (ASCII + 13);
                if (ASCII + 13 > 122) {
                    encodedChar = (char) (96 + (ASCII + 13 - 122));
                }
                answer += encodedChar;
            } else {
                answer += ch;
            }
        }
        System.out.println(answer);

    }
}
