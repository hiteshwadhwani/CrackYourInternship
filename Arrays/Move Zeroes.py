class Solution(object):
    def moveZeroes(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        
        idx = 0
        for i in nums:
            if i != 0:
                nums[idx] = i
                idx = idx+1

        while(idx < len(nums)):
            nums[idx] = 0
            idx = idx+1
