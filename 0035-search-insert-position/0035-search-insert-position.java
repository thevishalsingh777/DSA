class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int l = 0, h = n - 1;
        while(l<=h){
            int mid = l+(h-l)/2;
            if(target == nums[mid]) return mid;
            else if(target<nums[mid]) h = mid - 1;
            else l = mid + 1;
        }
        return l;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna