class Solution {
    //动态规划法
    public int rob1(int[] nums) {
        int n = nums.length;
        if(n == 0)
            return 0;
        //memo[i]表示考虑抢劫nums[i,,,n-1]所能获得最大收益（不是说一定从i开始抢劫）
        int[] memo = new int[n];
        //先考虑最简单的情况
        memo[n - 1] = nums[n - 1];
        for(int i = n - 2; i >= 0; i--) {
            //memo[i]的取值在考虑抢劫i号房子和不考虑抢劫之间最大值
            memo[i] = Math.max(nums[i] + (i + 2 >= n ? 0 : memo[i + 2]), nums[i + 1] + (i + 3 >= n ? 0 : memo[i + 3]));
        }
        return memo[0];
    }
    //记忆化搜索
    /**
     * 方式一：记忆化搜索
     * ① 状态：考虑抢劫 nums[index...num.length） 这个范围内的所有房子
     * ② 状态转移：tryRob(n) = Max{rob(0) + tryRob(2), rob(1) + tryRob(3)... rob(n-3) + tryRob(n-1), rob(n-2), rob(n-1)}
     *
     */
    private int[] memo;
    public int rob(int[] nums) {
        memo = new int[nums.length];
        Arrays.fill(memo, -1);
        return tryRob(nums, 0);
    }
    private int tryRob(int[] nums, int index) {
        if(index >= nums.length)
            return 0;
        //记忆化搜索可以避免重叠子问题的重复运算
        if(memo[index] != -1) {
            return memo[index];
        }
        //下面是对状态转移方程的描述
        int res = 0;
        for(int i = index; i < nums.length; i++) {
            res = Math.max(res, nums[i] + tryRob(nums, i + 2));
        }
        memo[index] = res;
        return res;
    }
}