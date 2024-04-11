class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) == '1') {
                mode = Math.abs(mode - 1);
                continue;
            }
            
            if (mode == 0 && i % 2 == 0) {
                sb.append(code.charAt(i));
            }
            if (mode == 1 && i % 2 == 1) {
                sb.append(code.charAt(i));
            }

        }
        
        if (sb.length() == 0) {
            return "EMPTY";
        }
        
        return sb.toString();
    }
}