#https://leetcode.com/problems/implement-stack-using-queues/
class MyStack(object):

    def __init__(self):
        self.que = deque()

    def push(self, x):
        """
        :type x: int
        :rtype: None
        """
        size = len(self.que)
        self.que.append(x)
        while size:
            self.que.append(self.pop())
            size -= 1
        

    def pop(self):
        """
        :rtype: int
        """

        return self.que.popleft()

        

    def top(self):
        """
        :rtype: int
        """

        return self.que[0]
        

    def empty(self):
        """
        :rtype: bool
        """

        return len(self.que) == 0
        


# Your MyStack object will be instantiated and called as such:
# obj = MyStack()
# obj.push(x)
# param_2 = obj.pop()
# param_3 = obj.top()
# param_4 = obj.empty()