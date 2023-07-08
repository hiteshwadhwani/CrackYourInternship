//https://leetcode.com/problems/merge-sorted-array/description/
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;

        int[] arr = new int[m+n];
        int idx = 0;

        while(i < m && j < n){
            arr[idx++] = nums1[i] < nums2[j] ? nums1[i++] : nums2[j++];
        }

        while(i < m){
            arr[idx++] = nums1[i++];
        }
        while(j < n){
            arr[idx++] = nums2[j++];
        }

        idx = 0;
        for(int x:arr){
            nums1[idx++] = x;
        }
    }
}