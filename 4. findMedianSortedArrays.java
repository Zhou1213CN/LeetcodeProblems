class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        if (n % 2 == 0){
            return (findKth(nums1, 0, nums2, 0, n/2)+ findKth(nums1, 0, nums2, 0, n/2+1))/2.0;
        }
        return findKth(nums1, 0, nums2, 0, n/2 + 1);
    }
    public static int findKth(int[] nums1, int start1, int[] nums2, int start2, int k){
        if (start1 >= nums1.length) return nums2[start2+k-1];
        if (start2 >= nums2.length) return nums1[start1+k-1];
        
        if (k==1) return Math.min(nums2[start2],nums1[start1]);
        int halfKthofA = start1 + k/2 - 1 < nums1.length ? nums1[start1 + k/2 -1] : Integer.MAX_VALUE;
        int halfKthofB = start2 + k/2 - 1 < nums2.length ? nums2[start2 + k/2 -1] : Integer.MAX_VALUE;
        if (halfKthofA < halfKthofB) return findKth(nums1, start1+k/2, nums2, start2, k-k/2);
        else return findKth(nums1, start1, nums2, start2+k/2, k-k/2);
        
        
    }
        
    
}