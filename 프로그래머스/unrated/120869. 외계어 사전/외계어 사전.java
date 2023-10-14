class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        for (String str : dic) {
            if (str.length() == spell.length) {
                boolean bool = true;
                for (String spellStr : spell) {
                    if (!str.contains(spellStr)) {
                        bool = false;
                        break;
                    }
                }
                if (bool == true) {
                    return 1;
                }
            }
        }
        return 2;
    }
}