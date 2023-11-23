import java.util.*;

class Solution {
    public int solution(int number, int limit, int power) {
    int result = 0;

    for (int i = 1; i <= number; i++) {
      int weapon = getDivisorCount(i);
      if (weapon > limit) {
        weapon = power;
      }
      result += weapon;
    }

    return result;
    }
    
  public static int getDivisorCount(int n) {
    int count = 0;

    for (int i = 1; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        count++;

        if (n / i != i) {
          count++;
        }
      }
    }

    return count;
  }
}