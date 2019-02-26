class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0,j=0;
        int t = 1; //定义跳出标记
        for(i=0;i<nums.length;i++){
            for(j=i+1;j<nums.length;j++) {
                if(target-nums[i]==nums[j]) { //找到符合的条件，标记，跳出第二层循环
                    t = 0;
                    break;
                }
            }
            if(t==0) //满足标记，跳出第一次循环
                break;
        }
        return new int[]{i,j}; //返回两个数的位置
    }
} 