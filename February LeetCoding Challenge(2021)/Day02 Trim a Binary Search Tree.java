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
 
 //Remove all nodes having the value that exceeded the value of low or high
class Solution {
    public TreeNode trimBST(TreeNode root, int low, int high) {
        /Base case where the value of the root is null;
        if(root == null){
            return null;
        }
        
        //Fix the left and right subtree of root
        root.left = trimBST(root.left, low, high);
        
        root.right = trimBST(root.right, low, high);
        
        //Fix the root. There are two possible cases for the root where the root's key is smaller than low value(root is not in range)
        if(root.val < low){
            return root.right;
        }
        
        //Root's key is greater than high value(root is not in range)
        if(root.val > high){
            return root.left;
        }
        return root;
    }
}
