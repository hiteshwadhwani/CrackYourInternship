# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

#https://leetcode.com/problems/merge-two-binary-trees/description/
class Solution(object):
    def mergeTrees(self, root1, root2):
        """
        :type root1: TreeNode
        :type root2: TreeNode
        :rtype: TreeNode
        """

        if(root1 != None and root2 != None):

            root = TreeNode(root1.val + root2.val)
            root.left = self.mergeTrees(root1.left, root2.left)
            root.right = self.mergeTrees(root1.right, root2.right)

            return root

        elif(root1 == None and root2 != None):
            return root2
        
        elif(root2 == None and root1 != None):
            return root1

        else:
            return None

            