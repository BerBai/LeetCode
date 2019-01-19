class Solution {
    //暴力法
    public int maxArea1(int[] height) {
        int max = 0;
        for(int i = 0; i < height.length; i++) {
            for(int j = i + 1; j < height.length; j++) {
                max = Math.max(max, Math.min(height[i], height[j]) * (j - i));
            }
        }
        return max;
    }
    
    //双指针法
    public int maxArea(int[] height) {
        int max = 0, l = 0, r = height.length - 1;
        while(l < r) {
            max = Math.max(max, Math.min(height[l], height[r]) * (r - l));
            if(height[l] < height[r])
                l++;
            else {
                r--;
            }
        }
        return max;
    }
}