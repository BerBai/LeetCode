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
    public int minDepth(TreeNode root) {
        int left_height = 0, right_height = 0;
        if(root == null)
            return 0;
        if(root.left != null && root.right != null) {
            left_height = minDepth(root.left);
            right_height = minDepth(root.right);
            return Math.min(left_height, right_height) + 1;
        } else if(root.left != null)  {
            left_height = minDepth(root.left);
            return left_height + 1;
        } else if(root.right != null){
            right_height = minDepth(root.right);
            return right_height + 1;
        } else {
            return 1;
        }
    }
}