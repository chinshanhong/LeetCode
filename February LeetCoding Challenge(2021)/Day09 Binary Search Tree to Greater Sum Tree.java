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
 
 //Credits to Coding Decoded
class Solution {
    Integer greaterNodeSum = 0;
    
    //TC : 0(n)
    //SC : 0(Log n)
    public TreeNode bstToGst(TreeNode root) {
        if(root == null){
            return null;
        }
        bstToGst(root.right);
        root.val = root.val + greaterNodeSum;
        greaterNodeSum = root.val;
        bstToGst(root.left);
        return root;
    }
}
