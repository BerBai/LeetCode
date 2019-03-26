//复杂度要求O(logn)
//将数组分为两组，一组有序，一组可能有序，也可能部分有序
//当target在nums[low],nums[mid]之间,继续分两组
//否则在另一半分两组查找
class Solution {
    public int search(int[] nums, int target) {
        return search(nums, 0, nums.length - 1, target);
    }
    private int search(int[] nums, int low, int high, int target) {
        if(low > high) 
            return -1;
        int mid = (low + high) / 2;
        if(nums[mid] == target)
            return mid;
        if(nums[mid] < nums[high]) {
            if(nums[mid] < target && nums[high] >= target) 
                return search(nums, mid+1, high, target);
            else 
                return search(nums, low, mid-1, target);
        } else {
            if(nums[low] <= target && nums[mid] > target)
                return search(nums, low,mid-1,target);
            else 
                return search(nums, mid+1,high,target);

        }
    }
}