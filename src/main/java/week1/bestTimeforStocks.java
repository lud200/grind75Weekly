package week1;

public class bestTimeforStocks {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int output = maxProfit(prices);
        System.out.println(output);
    }

    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int profit = 0, maxProfit = 0;
        int left = 0, right = 1;
        while (right < n) {
            if (prices[left] < prices[right]) {
                profit = prices[right] - prices[left];
                maxProfit = Math.max(profit, maxProfit);
            } else {
                left = right;
            }
            right++;
        }
        return maxProfit;
    }
}
