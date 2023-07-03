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

//https://leetcode.com/problems/binary-tree-paths/description/
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }
        if(root.left == null && root.right == null){
            List<String> temp = new ArrayList<>();
            temp.add(Integer.toString(root.val));
            return temp;
        }

        List<String> res = new ArrayList<>();

        for(String str: binaryTreePaths(root.left)){
            res.add(root.val + "->" + str);
        }

        for(String str: binaryTreePaths(root.right)){
            res.add(root.val + "->" + str);
        }

        return res;


    }
}