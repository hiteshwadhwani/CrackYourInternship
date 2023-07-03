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

//https://leetcode.com/problems/subtree-of-another-tree/description/
class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null) return false;

        if(root.val == subRoot.val){
            if(check(root, subRoot)) return true;
        }

        if(isSubtree(root.left, subRoot)){
            return true;
        }

        if(isSubtree(root.right, subRoot)){
            return true;
        }
        return false;
    }
    public boolean check(TreeNode root, TreeNode subRoot){
        if(root == null && subRoot == null) return true;

        if(root == null || subRoot == null) return false;
        if(root.val != subRoot.val) return false;

        boolean left = check(root.left, subRoot.left);
        boolean right = check(root.right, subRoot.right);

        return left && right;
    }
    
}