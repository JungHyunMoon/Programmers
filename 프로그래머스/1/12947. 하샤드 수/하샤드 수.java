class Solution {
    public boolean solution(int x) {
        int divisor = 0;
        String str = String.valueOf(x);
        for (int i = 0; i < str.length(); i++) {
            divisor += Integer.parseInt(str.substring(i, i+1));
        }

        return x % divisor == 0;
    }
}