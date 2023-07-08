//https://leetcode.com/problems/reverse-pairs/description/
class Solution {
    int cnt = 0;
    public int reversePairs(int[] nums) {
        mergeSort(nums, 0, nums.length-1);
        return cnt;
    }
    public void mergeSort(int[] nums, int i, int j){
        if(j-i == 0){
            return;
        }
        int mid = (i+j)/2;

        mergeSort(nums, i, mid);
        mergeSort(nums, mid+1, j);

        int y=mid+1;
        for(int x=i;x<=mid;x++){
            while(y <= j && nums[x] > 2 * (long)nums[y]) y++;
            cnt += (y - (mid+1));
        }

        merge(nums, i, mid, j);
    }
    public void merge(int[] nums, int lo, int mid, int hi){

        int i=lo;
        int j=mid+1;

        int[] newArray = new int[hi-lo+1];
        int idx = 0;

        while(i <= mid && j <= hi){
            if(nums[i] < nums[j]){
                newArray[idx++] = nums[i++];
            }
            else{
                newArray[idx++] = nums[j++];
            }
        }
        while(i <= mid){
            newArray[idx++] = nums[i++];
        }
        while(j <= hi){
            newArray[idx++] = nums[j++];
        }

        for(int x=0;x<newArray.length;x++){
            nums[x + lo] = newArray[x];
        }
    }
}