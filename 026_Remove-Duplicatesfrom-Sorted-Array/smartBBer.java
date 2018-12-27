class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) //当数组为空时，返回 0
            return 0;
        int i = 0;  //i记录新数组位置
        for(int j = 1; j < nums.length; j++) { //跳过重复项，重新给重复项位置赋值
            if(nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1; //返回长度
    }
}