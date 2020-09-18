import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.List;

class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Deque<Integer> path = new ArrayDeque<>();
        int len = nums.length;
        Arrays.sort(nums);
        boolean[] used = new boolean[len];
        dfs(len, 0, nums, used, path, res);
        return res;
    }
    public void dfs(int len, int resLen, int[] nums, boolean[] used, Deque<Integer> path, List<List<Integer>> res) {
        if(resLen == len) {
            res.add(new ArrayList<>(path));
            return ;
        }

        for(int i=0; i<len; i++) {
            if(used[i]) {
                continue;
            }

            if(i > 0 && nums[i-1] == nums[i] && !used[i-1]) {
                continue;
            }

            path.addLast(nums[i]);
            used[i] = true;
            dfs(len, resLen+1, nums, used, path, res);
            path.removeLast();
            used[i] = false;
        }
    }
    
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        Solution s = new Solution();
        System.out.println(s.permuteUnique(nums));
    }
}
