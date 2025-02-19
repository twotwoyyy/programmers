class Solution {
    public long solution(int price, int money, int count) {
        long nPrice = 0;
        long sum = 0;
        for(int i = 1; i <= count; i++) {
            nPrice = price * i;
            sum += nPrice;
        }
        return sum < money ? 0 : sum - money;
    }
}