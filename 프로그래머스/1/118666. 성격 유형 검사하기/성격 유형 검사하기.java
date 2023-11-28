import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public static String solution(String[] survey, int[] choices) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("R", 0);
        map.put("T", 0);
        map.put("C", 0);
        map.put("F", 0);
        map.put("J", 0);
        map.put("M", 0);
        map.put("A", 0);
        map.put("N", 0);

        for (int i = 0; i < survey.length; i++) {
            if (choices[i] == 4) {
                continue;
            }
            String key = getBiasType(survey[i], choices[i]);
            Integer value = map.get(key) + scoreCalculator(choices[i]);
            map.put(key, value);
        }
        String answer = "";

        answer += getKeyWithLagerValue("R", "T", map);
        answer += getKeyWithLagerValue("C", "F", map);
        answer += getKeyWithLagerValue("J", "M", map);
        answer += getKeyWithLagerValue("A", "N", map);

        return answer;
    }
    
        private static String getKeyWithLagerValue(String key1, String key2, HashMap<String, Integer> map) {
        if (key1.equals(key2)) {
            char charKey1 = key1.charAt(0);
            char charKey2 = key2.charAt(0);
            if (charKey1 > charKey2) {
                return key2;
            }
        }

        if (map.get(key1) < map.get(key2)) {
            return key2;
        }

        return key1;
    }

    private static String getBiasType(String category, int score) {
        List<Object> result = new ArrayList<>();
        int bias = 0;
        if (score > 4) {
            bias = 1;
        }
        return Character.toString(category.charAt(bias));
    }

    private static int scoreCalculator(int score) {
        if (score == 4) {
            return -1;
        }

        return Math.abs(4 - score);
    }
}