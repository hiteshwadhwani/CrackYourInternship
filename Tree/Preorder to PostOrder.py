#https://practice.geeksforgeeks.org/problems/preorder-to-postorder4423/1
class Node:

    def __init__(self, data=0):
        self.data = data
        self.left = None
        self.right = None

#Function that constructs BST from its preorder traversal.
def post_order(pre, size) -> Node:
    #code here
    if(len(pre) == 0):
        return None
    if(len(pre) == 1):
        return Node(pre[0])
    
    root = Node(pre[0])
    
    left_arr = [i for i in pre if i < pre[0]]
    right_arr = [i for i in pre if i > pre[0]]
    
    leftRoot = post_order(left_arr, size)
    rightRoot = post_order(right_arr, size)
    
    root.left = leftRoot
    root.right = rightRoot
    
    return root