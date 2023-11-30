import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> solution(String today, String[] terms, String[] privacies) {
        List<Integer> answer = new ArrayList<>();
        int todayY = Integer.parseInt(today.substring(0,4));
        int todayM = Integer.parseInt(today.substring(5,7));
        int todayD = Integer.parseInt(today.substring(8,10));

        int index = 1;
        for (String privacie : privacies ) {
            int privacieY = Integer.parseInt(privacie.substring(0,4));
            int privacieM = Integer.parseInt(privacie.substring(5,7));
            int privacieD = Integer.parseInt(privacie.substring(8,10));
            for (String term : terms) {
                String type = term.split(" ")[0];
                int num = Integer.parseInt(term.split(" ")[1]);
                if (privacie.endsWith(type)) {
                    privacieM += num;
                    while (privacieM > 12) {
                        privacieY++;
                        privacieM -= 12;
                    }
                    while (privacieM <= 0) {
                        privacieY--;
                        privacieM += 12;
                    }
                    if ((privacieY < todayY) || (privacieY == todayY && privacieM < todayM) ||
                        (privacieY == todayY && privacieM == todayM && privacieD <= todayD)) {
                        answer.add(index);
                    }
                }
            }
            index++;
        }

        return answer;
    }
}