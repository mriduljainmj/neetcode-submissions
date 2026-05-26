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
    private static List<Integer> nums;
    public List<Integer> postorderTraversal(TreeNode root) {
        nums = new ArrayList<>();
        postOrder(root);
        return nums;
    }

      public static void postOrder(TreeNode root){
        if(root == null){
            return;
        }
        
        postOrder(root.left);
        postOrder(root.right);
        nums.add(root.val);
    }
}