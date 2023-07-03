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
//https://leetcode.com/problems/range-sum-of-bst/description/
class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        return DFS(root, low, high);
    }
    public int DFS(TreeNode node, int low, int hi){
        if(node == null) return 0;
        int sum = 0;
        sum += DFS(node.left, low, hi);
        sum += DFS(node.right, low, hi);

        if(node.val >= low && node.val <= hi){
            sum += node.val;
        }

        return sum;
    }
}