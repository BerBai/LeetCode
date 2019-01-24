class Solution {
    //注意：考虑循环次数超过数组长度的情况
    public void rotate(int[] nums, int k) {
        //考虑循环次数超过数组长度的情况，循环次数就是k%nums.length
        k = k % nums.length;
        
        int[] tmp = new int[nums.length];
        for(int i = 0; i < k; i++) {
            tmp[i] = nums[nums.length - k + i];
        }
        for(int i = k; i < nums.length; i++) {
            tmp[i] = nums[i - k];
        }
        for(int i = 0; i < nums.length; i++) {
            nums[i] = tmp[i];
        }
    }
}