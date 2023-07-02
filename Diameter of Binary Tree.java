//https://leetcode.com/problems/diameter-of-binary-tree/description/
class Solution {
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        length(root);
        return max;
    }
    public int length(TreeNode node){
        if(node == null){
            return -1;
        }

        int left = length(node.left);
        int right = length(node.right);

        max = Math.max(max, left + right + 2);

        return Math.max(left, right) + 1;
    }
}