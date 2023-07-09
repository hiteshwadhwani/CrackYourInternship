//https://practice.geeksforgeeks.org/problems/find-pair-given-difference1559/1
class Solution
{
    public boolean findPair(int arr[], int size, int n)
    {
        Arrays.sort(arr);
        for(int i=0;i<size;i++){
            boolean find = BS(arr, n + arr[i], i+1, size-1);
            if(find){
                return true;
            }
        }
        return false;
        
    }
    public boolean BS(int[] nums, int target, int lo, int hi){
        while(lo <= hi){
            int mid = (lo+hi)/2;
            
            if(nums[mid] < target){
                lo = mid+1;
            }
            else if(nums[mid] > target){
                hi = mid-1;
            }
            else{
                return true;
            }
        }
        return false;
    }
}