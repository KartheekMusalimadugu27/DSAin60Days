
//Leetcode 121
public class BuyAndSellStock {

    public static void main(String[] args) {
        int[] array = {1,5,3,7,8};
        System.out.println(maxProfit(array));
    }

    public static int maxProfit(int[] prices) {
        if (prices.length == 1) return 0;
        int profit = 0;
        int left = 0;
        for (int right = 1; right < prices.length; right++) {
            if (prices[right] > prices[left]) {
                profit = Math.max(profit, prices[right] - prices[left]);
            } else {
                left = right;
            }
        }
        return profit;
    }

    public static int maxProfitWay2(int[] prices) {
        int min = Integer.MAX_VALUE;
        int ans = Integer.MIN_VALUE;
        for (int val : prices) {
            min = Math.min(min, val);
            ans = Math.max(ans, val - min);
        }
        return ans;
    }

}

// TC: O(n) and SC: O(1)
