class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length;
        int[] arr = new int[nums1.length + nums2.length];
        int i = 0, j = 0, idx = 0;
        while(i < n  && j < m){
            if(nums1[i] < nums2[j]){
                arr[idx++] = nums1[i];
                i++;
            }
            else {
                arr[idx++] = nums2[j];
                j++;
            }
        }
        while(i < n){
            
                arr[idx++] = nums1[i];
                i++;
            
        }
        while(j < m){
            
                arr[idx++] = nums2[j];
                j++;
            
        }
        int mid = arr.length /2;
        if(arr.length  % 2 != 0){
            return arr[mid];
        }
        return (arr[mid]+ arr[mid-1])/2.0;
        

    }
}
