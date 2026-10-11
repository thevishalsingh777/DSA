class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = 0;
        int digitsum = 0;
        for(int val : nums){
                sum+=val;
                while(val!=0){
                    digitsum += val%10;
                    val/=10;
        }
    }
        return sum - digitsum;
}
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna