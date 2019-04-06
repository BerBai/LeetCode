class Solution {
    //如果是偶数个数，先手总能拿到奇数列或偶数列数，即总能拿到最大数
    //否则，进行判断
    public boolean PredictTheWinner(int[] nums) {
        int len = nums.length;
        int[][] dp = new int[len+1][len+1];
        int sum = 0;
        if(len % 2 == 0 || len <= 1)
            return true;
        else {
            for(int i = 0;i<len;i++) {
                int total = 0;
                sum += nums[i];
                for(int j=i;j<len;j++){
                    total += nums[j];
                    dp[j][i] = total;
                }
            }
            for(int i=len-2;i>=0;i--){
                for(int j=i+1;j<len;j++){
                    dp[i][j] = dp[j][i] - Math.min(dp[i][j - 1], dp[i + 1][j]);
                }
            }
            if(dp[0][len-1]*2>=sum)
                return true;
        }
        return false;
    }
}
