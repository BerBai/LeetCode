import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution{
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        Arrays.sort(candidates);

        dfs(0, target, candidates.length, candidates, path, res);


        System.out.print("最初序列 -> ");
        for (Integer integer : candidates) {
            System.out.print(integer + "  ");
        }
        System.out.println("最终结果 -> " + res);

        return res;
    }

    public void dfs(int begin, int target, int len, int[] candidates, List<Integer> path, List<List<Integer>> res) {
        if(target == 0) {
            res.add(new ArrayList<>(path));
            return ;
        }

        for(int i = begin; i < len; i++) {
            // 已经从小到大排序，减去后面的数皆会小于0
            if(target - candidates[i] < 0) {
                break;
            }
            // 
            if(i > begin && candidates[i] == candidates[i-1]) {
                continue;
            }
            
            path.add(candidates[i]);
            System.out.println("递归前 -> " + path + "  剩余：" + (target - candidates[i]));
            dfs(i + 1, target - candidates[i], len, candidates, path, res);
            path.remove(path.size() - 1);
            System.out.println("递归后 -> " + path + "  剩余：" + target);
        }
    }

    public static void main(String[] args) {
        int[] nums = {10,1,2,7,6,1,5};

        Solution s = new Solution();

        s.combinationSum2(nums, 8);
    }
}