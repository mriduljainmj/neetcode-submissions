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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> arr = new ArrayList<Integer>();
        if (root != null) {
            q.offer(root);
        }

        while (q.size() > 0) {
            int len = q.size();
             TreeNode right = null;
            for (int i = 0; i < len; i++) {
                TreeNode temp = q.poll();
                if (temp != null) {
                    right = temp;
                    if (temp.left != null) {
                        q.offer(temp.left);
                    }
                    if (temp.right != null) {
                        q.offer(temp.right);
                    }
                }
            }
            if(right!=null){
                arr.add(right.val);
            }
        }

        return arr;
    }
}
