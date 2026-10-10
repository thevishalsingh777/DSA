class Solution {
    public int smallestIndex(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i++){
            int m = nums[i];
            int sum = 0;
            while(m!=0){
                sum+= m%10;
                m /= 10;
            }
            if(sum == i){
                return i;
            }
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna