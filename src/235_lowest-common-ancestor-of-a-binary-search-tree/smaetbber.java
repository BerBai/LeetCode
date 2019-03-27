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
    //根据二叉树的特点进行递归
    //对数据有较强依赖，容错性差
    TreeNode ans = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        search(root, p, q);
        return ans;
    }
    public void search(TreeNode root, TreeNode p, TreeNode q) {
        if((root.val - p.val) * (root.val - q.val) <= 0) {
            ans = root;
        } else if(root.val < p.val && root.val < q.val) {
            search(root.right, p, q);
        } else {
            search(root.left, p, q);
        }
    }
}