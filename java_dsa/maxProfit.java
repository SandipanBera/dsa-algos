package java_dsa;

public class maxProfit {
    public static String Profit(int[] prices) {
        if (prices.length == 0) {
            return "not possible";
        }
        int minPrice = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (minPrice > prices[i]) {
                minPrice = prices[i];
                continue;
            }
            int profit = prices[i] - minPrice;
            if (maxProfit < profit) {
                maxProfit = profit;
            }
        }
        String result = "impossible";
        if (maxProfit > 0) {
            result = "possible";
        }
        return result;
    }

    public static void main(String[] args) {
        int[] days = { 7, 1, 5, 3, 6, 4 };
     System.out.println( Profit( days )); 
    }
}
