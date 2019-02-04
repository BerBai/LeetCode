class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int iNum =Integer.MAX_VALUE ;
        int jNum;
        int kNum;
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length && nums[i] <= 0; i++) {
            if (iNum == nums[i]) {
                continue;
            }
            iNum = nums[i];
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum > 0) {
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    result.add(list);

                    jNum = nums[j];
                    do {
                        j++;
                        if (j>=k) {
                            break;
                        }
                    } while (jNum == nums[j]);
                    kNum = nums[k];
                    do {
                        k--;
                        if (j>=k) {
                            break;
                        }
                    } while (kNum == nums[k]);
                }
            }
        }
        return result;
    }
}