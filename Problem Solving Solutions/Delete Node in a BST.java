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
    public TreeNode deleteNode(TreeNode root, int key) {
        TreeNode parent = null;
        TreeNode current = root;
        
        while(current != null){
            if(key < current.val){
                parent = current;
                current = current.left;
            }
            else if(key > current.val){
                parent = current;
                current = current.right;
            }
            else{
                break;
            }
        }
        if(current == null){
            return root;
        }
        if(current.left == null){
            if(parent == null){
                root = current.right;
            }
            else{
                if(key > parent.val){
                    parent.right = current.right;
                }
                else{
                    parent.left = current.right;
                }
            }
        }
        else{
            TreeNode parentOfRightMost = current;
            TreeNode rightMost = current.left;
            
            while(rightMost.right != null){
                parentOfRightMost  = rightMost;
                rightMost = rightMost.right;
            }
            
            current.val = rightMost.val;
            
            if(parentOfRightMost.right == rightMost){
                parentOfRightMost.right = rightMost.left;
            }
            else {
                parentOfRightMost.left = rightMost.left;
            }
        }
        return root;
    }
}
