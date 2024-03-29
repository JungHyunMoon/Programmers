import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
            List<Integer> divisors = getDivisors(i);
            int size = divisors.size();
            if (size % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }
        return answer;
    }
    
        public static List<Integer> getDivisors(int n) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
            }
        }
        return divisors;
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < (Math.sqrt(n)) + 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

