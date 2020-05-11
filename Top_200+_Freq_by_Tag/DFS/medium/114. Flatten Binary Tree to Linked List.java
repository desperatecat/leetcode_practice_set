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

//https://leetcode.com/problems/flatten-binary-tree-to-linked-list/discuss/37181/Easy-1ms-Java-DFS-solution
class Solution {
    public void flatten(TreeNode root) {
        if(root==null)
            return;
        flatten(root.left);
        flatten(root.right);
        TreeNode left  = root.left;
        TreeNode right = root.right;
        root.left  = null;
        root.right = left; 
        while(root.right!=null)
            root = root.right;
        root.right = right;
    }

}