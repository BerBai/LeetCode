import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution{
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        dfs(1, k, n, path, res);

        System.out.println("最终结果 -> " + res);

        return res;
    }

    public void dfs(int begin, int k, int n, List<Integer> path, List<List<Integer>> res){
        if(k == 0 && n == 0) {
            res.add(new ArrayList<>(path));
            return ;
        }
        for(int i = begin; i < 10; i++) {
            if(n - i < 0 || k <= 0) {
                break;
            }
            path.add(i);
            System.out.println("递归前 -> " + path);
            dfs(i + 1, --k, n - i, path, res);
            k++;
            path.remove(path.size() - 1);
            System.out.println("递归后 -> " + path);
        }
    }

    public static void main(String[] args) {

        Solution s = new Solution();

        s.combinationSum3(3, 9);
    }
}