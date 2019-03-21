/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    List<Integer> list = new ArrayList<>();
    int num = 0;
    public int kthSmallest(TreeNode root, int k) {
        num = k;
        sovle(root);
        return list.get(k-1);
    }
    public void sovle(TreeNode root) {
        if(root == null)
            return;
        sovle(root.left);
        if(list.size() == num)
            return;
        list.add(root.val);
        sovle(root.right);
    }
}