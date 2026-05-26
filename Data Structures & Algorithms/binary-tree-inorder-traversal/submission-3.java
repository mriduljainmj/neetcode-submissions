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
    private static  List<Integer> nums ;
    public List<Integer> inorderTraversal(TreeNode root) {
        nums  = new ArrayList<>();
        inorder(root);
        return nums;
    }

    public static void inorder(TreeNode root){
        if(root == null){
            return;
        }
        inorder(root.left);
        nums.add(root.val);
        inorder(root.right);
    }
}