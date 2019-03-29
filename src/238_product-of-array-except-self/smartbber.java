class Solution {
    //取巧：一次计算完所有的乘积
    //考虑到零的问题
    //1.含有一个零，只有在零位的时候乘积不为零，其余都为零
    //2.含两个零及以上，全为零
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int tem = 1, isZero = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                isZero++;
            } else {
                tem *= nums[i];
            }
        }
        for(int i = 0; i < nums.length; i++) {
            if(isZero == 0) {
                ans[i] = tem / nums[i];
            } else if(isZero == 1) {
                if(nums[i] == 0) {
                    ans[i] = tem;
                } else {
                    ans[i] = 0;
                }
            } else {
                ans[i] = 0;
            }
        }
        return ans;
    }
}