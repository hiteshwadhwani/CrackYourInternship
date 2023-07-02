//https://leetcode.com/problems/invert-binary-tree/description/
class Solution {
    public TreeNode invertTree(TreeNode root) {
        invertHelper(root);
        return root;
    }
    public void invertHelper(TreeNode node){
        if(node == null) return;
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;

        invertHelper(node.left);
        invertHelper(node.right);
    }
}