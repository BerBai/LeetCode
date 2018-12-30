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
    public boolean isSymmetric(TreeNode root) {
        return isMirrorTree(root, root);
    }
    public boolean isMirrorTree(TreeNode p, TreeNode q) {
        if(p == null) {
            return q == null;
        } else if(q == null){
            return p == null;
        } else if(p.val == q.val) {
            return isMirrorTree(p.left, q.right) && isMirrorTree(p.right, q.left);
        } else {
            return false;
        }
    }
}