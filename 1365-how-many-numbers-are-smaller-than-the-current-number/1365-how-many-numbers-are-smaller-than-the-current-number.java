class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] a = new int[nums.length];
        int n = nums.length;
        for(int i = 0; i < n; i++){
            int count = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[j] < nums[i]){
                    count++;
                }
            }
            a[i] = count;
        }
        return a;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna