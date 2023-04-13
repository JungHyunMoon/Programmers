class Solution {
    public boolean solution(String s) {
        if(s.length() != 4 && s.length() != 6)
            return false;

        char []chArr = s.toCharArray();
        for(int i=0; i<chArr.length; i++) {
            if( !isNumber(chArr[i]) )
                return false;
        }

        return true;
    }
    public boolean isNumber(char c) {
        final int A = c;
        return 48 <= A && A <= 57 ;
    }
}