//https://leetcode.com/problems/find-the-duplicate-number/description/
class Solution {

    // using binary serach O(nlogn)
    public int findDuplicate(int[] nums) {
        int l = 0;
        int r = nums.length;

        while(l < r){
            int mid = l + (r - l)/2;
            int cnt = 0;
            for(int i=0;i<nums.length;i++){
                if(nums[i] <= mid) cnt++;
            }

            if(cnt <= mid){
                l = mid + 1;
            }
            else{
                r = mid;
            }
        }
        return l;
    }


    // using fast ans slow pointer O(n)
    public int findDuplicate(int[] nums) {
        // fast and slow pointer
        int slow = 0;
        int fast = 0;

        while(true){
            slow = nums[slow];
            fast = nums[nums[fast]];
            if(slow == fast) break;
        }

        slow = 0;
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}