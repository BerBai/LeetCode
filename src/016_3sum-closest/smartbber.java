class Solution {
    public int threeSumClosest(int[] nums, int target) {
        //先排序
        Arrays.sort(nums);
        int ans = nums[0] + nums[1] + nums[2];
        for(int i = 0; i < nums.length - 2; i++) {
            int j = i + 1, k = nums.length - 1;
            while(j < k) {//双指针
                int tmp = nums[j] + nums[k] + nums[i];
                if(Math.abs(tmp - target) < Math.abs(ans - target)) {
                    ans = tmp;
                } 
                if(tmp > target) {
                    k--;
                } else if(tmp < target) {
                    j++;
                } else { //如果等于target直接返回
                    return target;
                }
            }
            
        }
        return ans;
    }
}