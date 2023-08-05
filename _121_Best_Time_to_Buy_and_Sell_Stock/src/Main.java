public class Main {
    public static void main(String[] args) {
        int[] prices = {1,2};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int profit = 0;
        int minBuy = 100000; // max value

        for (int price : prices) {
            if (price < minBuy) {
                minBuy = price;
            } else if (price - minBuy > profit) {
                profit = price - minBuy;
            }
        }
        return profit;
    }
}