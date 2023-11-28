class Solution {
    public int[] solution(String[] wallpaper) {
        int left = 99;
        int rigth = -1;
        int top = 99;
        int bottom = -1;
        for(int i=0; i< wallpaper.length;i++ ){
            for(int j=0; j<wallpaper[i].length();j++){
                if(wallpaper[i].charAt(j)=='#'){
                    top = Math.min(top,i);
                    left = Math.min(left,j);
                    bottom = Math.max(bottom,i);
                    rigth = Math.max(rigth,j);
                }
            }
        }
        return new int[]{top, left, bottom + 1, rigth + 1};
    }
}