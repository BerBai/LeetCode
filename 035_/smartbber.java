class Solution {
    public int searchInsert(int[] nums, int target) {
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < target) {
                count ++;
            } else {
                break;
            }
        }
        return count;
    }
}