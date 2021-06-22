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
    
    
    public boolean isValidBST(TreeNode root) {
        if(root == null){
            return true;
        }
        else{
            ArrayList<Integer> list = new ArrayList<>();
            inorderTraversal(root, list);
            return isSorted(list);
        }
    }
    
    public void inorderTraversal(TreeNode root, ArrayList<Integer> list){
        if(root == null){
            return;
        }
        inorderTraversal(root.left, list);
        list.add(root.val);
        inorderTraversal(root.right, list);
    }
    
    public boolean isSorted(ArrayList<Integer> list){
        for(int i = 0; i < list.size() - 1; i++){
            if(list.get(i) >= list.get(i + 1)){
                return false;
            }
        }
        return true;
    }
}
