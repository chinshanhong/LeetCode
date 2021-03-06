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
    
    public List<Double> averageOfLevels(TreeNode root) {
        ArrayList<Double> res = new ArrayList<Double>();
      //Traversing level by level
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        long sum = 0, count = 0;
        
        q.add(root);
        
        while(!q.isEmpty()){
          // Compute sum of nodes and  
          // count of nodes in current  
          // level. 
            sum = 0;
            count = 0;
            Queue<TreeNode> temp = new LinkedList<TreeNode>();
            while(!q.isEmpty()){
                TreeNode n = q.peek();
                q.remove();
                sum += n.val;
                count++;
                if(n.left != null) temp.add(n.left);
                if(n.right != null) temp.add(n.right);
            }
            q = temp;
            res.add((double)sum / count);
        }
        return res;
    }
}
