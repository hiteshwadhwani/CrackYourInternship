#https://leetcode.com/problems/next-greater-element-i/description/
class Solution(object):
    def nextGreaterElement(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[int]
        """

        stack  = []

        res = [-1 for i in range(len(nums1))]

        for i in nums2[::-1]:
            while stack and stack[len(stack)-1] < i:
                stack.pop()

            if i in nums1 and stack:
                res[nums1.index(i)] = stack[len(stack)-1]

            stack.append(i)
        return res
            
        