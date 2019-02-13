class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        for(int n : nums) { //获取数组的每一个值
            int size = ans.size();
            for(int i = 0; i < size; i++) {
                List<Integer> subset = new ArrayList<>(ans.get(i));
                subset.add(n);
                ans.add(subset);
            }
        }
        return ans;
    }
}