#https://practice.geeksforgeeks.org/problems/binary-tree-to-dll/1
class Solution:
    prev = None
    def bToDLL(self,root):
        self.inorder(root)
        head = self.prev
        next = head.left
        
        while(next):
            next.right = head
            head = next
            next = next.left
        return head
    def inorder(self, node):
        if(node == None):
            return
        self.inorder(node.left)
        node.left = self.prev
        self.prev = node
        self.inorder(node.right)