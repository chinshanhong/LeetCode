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
//Credits goes to scottynoshotty
class Solution {
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        if(d == 1) {
            TreeNode newRoot = new TreeNode(v);
            newRoot.left = root;
            return newRoot;
        }
        Queue<TreeNode> level = getLevel(root, d);
        while(!level.isEmpty()){
            TreeNode curr = level.poll();
            TreeNode newLeft = new TreeNode(v);
            TreeNode newRight = new TreeNode(v);
            newLeft.left = curr.left;
            newRight.right = curr.right;
            curr.left = newLeft;
            curr.right = newRight;
        }
        return root;
    }
    
    public Queue<TreeNode> getLevel(TreeNode root, int depth){
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int currDepth = 1;
        while(currDepth < depth - 1){
            Queue<TreeNode> temp = new LinkedList<>();
            while(!q.isEmpty()){
                TreeNode curr = q.poll();
                if(curr.left != null){
                    temp.add(curr.left);
                }
                if(curr.right != null){
                    temp.add(curr.right);
                }
            }
            q = temp;
            currDepth++;
        }
        return q;
    }
}
