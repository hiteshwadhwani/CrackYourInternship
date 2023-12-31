// https://leetcode.com/problems/majority-element/
class Solution {
    public int majorityElement(int[] nums) {
        int count = 1;
        int ans = nums[0];

        for(int i = 1; i<nums.length; i++){
            if(ans == nums[i]) count++;
            else count--;

            if(count == 0){
                ans = nums[i];
                count = 1;
            }
        }
        return ans;
    }
 