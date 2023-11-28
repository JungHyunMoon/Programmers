import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        
        List<Integer> ingredientArr = new ArrayList<>();
		for (int item : ingredient) {
			ingredientArr.add(item);
		}
		
		int i = 0;
		while (true) {
			if (i+3 >= ingredientArr.size()) {
				break;
			}
			if (ingredientArr.get(i) == 1 && ingredientArr.get(i + 1) == 2 && ingredientArr.get(i + 2) == 3
					&& ingredientArr.get(i + 3) == 1) {
				answer++;
				ingredientArr.remove(i);
				ingredientArr.remove(i);
				ingredientArr.remove(i);
				ingredientArr.remove(i);
				if (i >= 4) {
					i -= 4;
				} else {
					i = -1;
				}
			}
			
			i++;
			if (i == ingredientArr.size() - 1)
			break;
		}
        
        return answer;
    }
}