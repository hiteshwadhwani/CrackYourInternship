#https://leetcode.com/problems/split-array-largest-sum/description/
class Solution(object):
    def splitArray(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """

        def possible(mid):
            sum = 0
            count = 1
            for i in range(len(nums)):
                sum += nums[i]

                if sum > mid:
                    count += 1
                    sum = nums[i]
            return count <= k

        lo = 0
        hi = sum(nums)

        for i in nums:
            lo = max(lo, i)

        while(lo < hi):
            mid = (lo + hi)/2

            if(possible(mid)):
                hi = mid
            else:
                lo = mid+1
        return lo