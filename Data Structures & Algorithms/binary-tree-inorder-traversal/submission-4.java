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
    private static ArrayList<Integer> arr;
    public List<Integer> inorderTraversal(TreeNode root) {
        arr = new ArrayList<Integer>();
        inOrder(root);
        return arr;
    }

    public static void inOrder(TreeNode root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        arr.add(root.val);
        inOrder(root.right);
    }
}