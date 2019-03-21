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
    //将二叉树写入list
    List<Integer> list = new ArrayList<>();
    int num = 0;
    public int kthSmallestList(TreeNode root, int k) {
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
    
    //中序遍历
    int time = 0;
    public int kthSmallest(TreeNode root, int k) {
        int ans = -1;
        if(root == null) {
            return ans;
        }
        
        ans = kthSmallest(root.left, k);
        if(time == k) {
            return ans;
        }
        if(++time == k) {
            return root.val;
        }
        return kthSmallest(root.right, k);
    }
}