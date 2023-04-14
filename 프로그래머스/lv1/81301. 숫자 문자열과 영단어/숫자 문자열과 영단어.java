class Solution {
    public int solution(String s) {
        String[] numStrList = {"zero", "0", "one", "1", "two", "2", "three", "3", "four", "4", "five", "5", "six", "6", "seven", "7", "eight", "8", "nine", "9"};
		String numStr = "";
		for (int j = 0; j < numStrList.length; j = j +2) {
			numStr = numStrList[j];
			if (s.contains(numStr) == true) {
				s = s.replaceAll(numStr, numStrList[j+1]);
			}
		}
        int answer = Integer.valueOf(s);
        return answer;
    }
}