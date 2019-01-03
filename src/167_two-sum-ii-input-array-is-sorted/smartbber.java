class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        boolean isTrue = false;
        for(int i=0; i < numbers.length; i++) {
            int tmp = target - numbers[i];
            ans[0] = i + 1;
            
            for(int j = i + 1; j < numbers.length; j++) {
                if(tmp - numbers[j] == 0) {
                    ans[1] = j + 1;
                    isTrue = true;
                    break;
                }
            }
            if(numbers[i+1] == target - tmp )
                i++;
            if(isTrue) {
                break;
            }
        }
        return ans;
    }
}