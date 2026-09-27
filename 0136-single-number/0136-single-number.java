class Solution {
    public int singleNumber(int[] nums) {
        int unique = 0;
        if(nums.length < 2){
            return nums[unique];
        }
        else{
        for(int i = 0; i < nums.length; i++){
            unique = nums[i];
            for(int j = 0; j < nums.length; j++){
                if(j==i){
                    continue;
                }
                if(nums[j] == unique){
                    break;
                }
                if(j == nums.length - 1){
                    return unique;
                }
            }
        }
        }
        return unique;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna