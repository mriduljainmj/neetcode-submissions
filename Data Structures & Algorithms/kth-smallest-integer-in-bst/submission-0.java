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
    private ArrayList<Integer> sortedList;
    public int kthSmallest(TreeNode root, int k) {
       sortedList = new ArrayList<Integer>();
       inOrderTraverse(root);
       return sortedList.get(k-1);
    }

    private void inOrderTraverse(TreeNode node){
        if(node == null){
            return;
        }
        inOrderTraverse(node.left);
        sortedList.add(node.val);
        inOrderTraverse(node.right);
    }
}
