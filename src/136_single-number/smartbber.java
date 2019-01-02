//利用异或运算 
//两个相同的数异或为0
//题意 只有一个单个的数，其余为双数

class Solution {
    public int singleNumber(int[] nums) {
        int len = nums.length;
        int ans = 0;
        for(int i = 0; i < len; i++) {
            ans ^= nums[i];
        }
        return ans;
        
    }
}