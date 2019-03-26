//复杂度要求O(logn)
//将数组分为两组，一组有序，一组可能有序，也可能部分有序
//此时有序部分用二分法查找。
//无序部分再一分为二，其中一个一定有序，另一个可能有序，可能无序。

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