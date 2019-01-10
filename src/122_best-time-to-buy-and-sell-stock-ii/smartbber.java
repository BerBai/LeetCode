class Solution {
    //暴力超时
    public int maxProfit1(int[] prices) {
        return calculate(prices, 0);
    }
    
    public int calculate(int[] prices, int s) {
        if(s >= prices.length) 
            return 0;
        int max = 0;
        for(int i = s; i < prices.length; i++) {
            int maxprofit = 0;
            for(int j = i + 1; j < prices.length; j++) {
                if(prices[i] < prices[j]) {
                    int profit = calculate(prices, j + 1) + prices[j] - prices[i];
                    if(profit > maxprofit) {
                        maxprofit = profit;
                    }
                }
            }
            if(maxprofit > max)
                max = maxprofit;
        }
        return max;
    }
    
    //峰谷法
    public int maxProfit2(int[] prices) {
        if(prices.length == 0) 
            return 0;
        int i = 0;
        int valley = prices[0];
        int peak = prices[0];
        int maxprofit = 0;
        while (i < prices.length - 1) {
            while (i < prices.length - 1 && prices[i] >= prices[i + 1])
                i++;
            valley = prices[i];
            while (i < prices.length - 1 && prices[i] <= prices[i + 1])
                i++;
            peak = prices[i];
            maxprofit += peak - valley;
        }
        return maxprofit; 
    }
    
    //一次遍历法
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                maxprofit += prices[i] - prices[i - 1];
        }
        return maxprofit;
    }
}