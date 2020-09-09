
import java.util.List;
import java.util.ArrayList;

public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        int len = candidates.length;
        dfs(0, target, len, candidates, path, result);
        return result;
    }

    public void dfs(int begin, int target, int len, int[] candidates, List<Integer> path, List<List<Integer>> result) {
        if(0 == target) {
            result.add(new ArrayList<>(path));
            return;
        }
        if(0 > target) {
            return;
        }
        for(int i = begin; i < len; i++) {
            if(target - candidates[i] < 0) {
                continue;
            }

            path.add(candidates[i]);
            System.out.println("递归前->" + path);
            dfs(i, target - candidates[i], len, candidates, path, result);
            path.remove(path.size() - 1);
            System.out.println("递归后->" + path);
        }
    }

    public static void main (String[] args) {
        int[] candidates = {2, 3, 6, 7};
        Solution resultTotal = new Solution();
        List<List<Integer>> res = resultTotal.combinationSum(candidates, 7);
        System.out.println("最终结果->" + res);
    }
}
