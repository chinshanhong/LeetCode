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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            root = new TreeNode(val);
        }
        else{
            TreeNode parent = null;
            TreeNode current = root;
            
            while(current != null){
                if(val > current.val){
                    parent = current;
                    current = current.right;
                }
                else if(val < current.val){
                    parent = current;
                    current = current.left;
                }
            }
            if(val > parent.val){
                parent.right = new TreeNode(val);
            }
            else{
                parent.left = new TreeNode(val);
            }
        }
        return root;
    }
}
