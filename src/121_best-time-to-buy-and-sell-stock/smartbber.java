class Solution {
    //蛮力法
    public int maxProfit1(int[] prices) {
        int mE = 0;
        for(int i = 0; i < prices.length; i++) {
            for(int j = i + 1; j < prices.length; j++) {
                int tmp = prices[j] - prices[i];
                mE = mE < tmp ? tmp : mE;
            }
        }
        return mE;
    }
    //一次遍历
    public int maxProfit(int[] prices){
        int minPrice = Integer.MAX_VALUE;
        int maxPrice = 0;
        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < minPrice) {
                minPrice = prices[i];
            } else if(prices[i] - minPrice > maxPrice) {
                maxPrice = prices[i] - minPrice;
            }
        }
        return maxPrice;
    }
}