import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        
        HashMap<String, Object> map = new HashMap<String, Object>();
		for (int i = 0; i < name.length; i++) {
			String nameKey = name[i];
			int score = yearning[i];
			map.put(nameKey, score);
		}
        
        int[] answer = new int[photo.length];
		for(int i = 0; i < photo.length ; i++) {
			int yearningScore = 0;
			for (int j = 0; j < photo[i].length; j++) {
				try {
					yearningScore += (int) map.get(photo[i][j]);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			answer[i] = yearningScore;
		}
        
        return answer;
    }
}