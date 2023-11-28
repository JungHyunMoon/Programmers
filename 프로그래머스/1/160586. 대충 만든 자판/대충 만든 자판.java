import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
    int[] answer = new int[targets.length];
    Map<Character, Integer> keyMap = new HashMap<>();

    for (String key : keymap) {
      for (int i = 0; i < key.length(); i++) {
        Character target = key.charAt(i);
        if (!keyMap.containsKey(target) || keyMap.get(target) > i) {
          keyMap.put(target, i + 1);
        }
      }
    }

    for (int i = 0; i < targets.length; i++) {
      answer[i] = getPressCount(targets[i], keyMap);
    }

    return answer;
  }

  private static int getPressCount(String s, Map<Character, Integer> keyMap) {
    int count = 0;
    char[] strArr = s.toCharArray();
    for (char str : strArr) {
      if (keyMap.containsKey(str)) {
        count += keyMap.get(str);
      } else {
        return -1;
      }
    }
    return count;
  }
}