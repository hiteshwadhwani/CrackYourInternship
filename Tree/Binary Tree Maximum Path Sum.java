//https://leetcode.com/problems/binary-tree-maximum-path-sum/description/
class Solution {
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        solve(root);
        return max;   
    }
    public int solve(TreeNode node){
        if(node == null){
            return 0;
        }
        int left = solve(node.left);
        int right = solve(node.right);

        int res = Math.max(node.val, node.val + Math.max(left, right));
        max = Math.max(max, Math.max(res, node.val + left + right));

        return res;
    }
}