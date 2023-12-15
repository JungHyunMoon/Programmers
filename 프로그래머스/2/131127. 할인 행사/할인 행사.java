import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int days = 10;

        Map<String, Integer> wish = new HashMap<>();

        for(int i = 0; i < want.length; i++){
            wish.put(want[i], number[i]);
        }

        for(int i = 0; i < discount.length - days + 1; i++){
            Map<String, Integer> sale = new HashMap<>();

            for(int j = 0; j < days; j++){
                sale.put(discount[i + j], sale.getOrDefault(discount[i + j], 0) + 1);
            }

            Boolean isSame = true;

            for(String key : wish.keySet()){
                if(wish.get(key) != sale.get(key)){
                    isSame = false;
                    break;
                }
            }

            if (isSame) {
                answer++;
            }
        }

        return answer;
    }
}