class Solution {
    public int removeDuplicates(int[] nums) {
        int prev = Integer.MIN_VALUE;
        int count = 0;
        for(int n : nums){
            if(n!=prev){
                nums[count++] = n;
                prev = n;
            }
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna