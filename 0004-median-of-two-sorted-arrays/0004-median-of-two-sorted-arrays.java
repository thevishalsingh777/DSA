class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] nums3 = new int[n1+n2];
        int i = 0, j = 0, k = 0;
        while(i < n1 && j < n2){
            if(nums1[i] < nums2[j]){
                nums3[k++] = nums1[i++];
            }
            else{
                nums3[k++] = nums2[j++];
            }
        }
        while(i < n1){
            nums3[k++] = nums1[i++];
        }
        while(j < n2){
            nums3[k++] = nums2[j++];
        }
        int n = n1+n2;
        if(n % 2 != 0) return (double)nums3[n/2];
        return ((double)nums3[n/2] + (double)nums3[(n-1)/2]) / 2.0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna