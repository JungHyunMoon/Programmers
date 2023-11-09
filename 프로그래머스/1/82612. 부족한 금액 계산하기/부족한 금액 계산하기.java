class Solution {
    public long solution(int price, int money, int count) {
        long account = money;

        for (int i = 1; i <= count; i++) {
            account -= price * i;
        }

       return (account > 0 ? 0 : -account);
    }
}