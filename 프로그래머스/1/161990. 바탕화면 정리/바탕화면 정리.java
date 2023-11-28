class Solution {
    public int[] solution(String[] wallpaper) {
        int minLeft = wallpaper[0].length();
        int maxRigth = 0;
        int top = 0;
        int bottom = wallpaper.length;
        for (String grid : wallpaper) {
            int minLeftPoint = grid.indexOf("#");
            if (minLeftPoint != -1 && minLeftPoint < minLeft) {
                minLeft = minLeftPoint;
            }
            int maxRightPoint = grid.lastIndexOf("#") + 1;
            if (maxRightPoint > maxRigth) {
                maxRigth = maxRightPoint;
            }
        }

        for (String grid : wallpaper) {
            if (!grid.contains("#")) {
                top++;
            } else {
                break;
            }
        }

        for (int i = wallpaper.length - 1; i > 0; i--) {
            if (!wallpaper[i].contains("#")) {
                bottom--;
            } else {
                break;
            }
        }


        return new int[]{top, minLeft, bottom, maxRigth};
    }
}