class Solution {
    public int removeElement(int[] nums, int val) { //双指针
        int i = 0;//记录新数组的长度
        for(int j = 0; j < nums.length; j++){ //当数组中的值不与val相等时更新
            if(val != nums[j]) {
                nums[i] = nums[j];
                i++;
            } 
        }
        return i;
    }
}