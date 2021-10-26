/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        TreeNode head = root;
        if(root == null) return root;
        if(root.left == null && root.right == null) return root;
        TreeNode tmp = root.right;
        root.right = root.left;
        root.left = tmp;
        if(root.left != null) invertTree(root.left);
        if(root.right != null) invertTree(root.right);
        return head;
    }
}
