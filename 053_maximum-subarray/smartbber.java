class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0], sum = 0; //max保留最大计算结果，sum计算下次结果
        for(int i = 0; i < nums.length; i++){ 
            if(sum > 0) { 
                sum += nums[i];
            } else {
                sum = nums[i]; 
            }
            max = Math.max(sum,max);
        }
        return max;
    }
}
