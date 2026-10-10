class Solution {
    public boolean canAliceWin(int[] nums) {
        int single = 0; 
        int doubled = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 10){
                single+=nums[i];
            }
            else{
                doubled+=nums[i];
            }
        }
        if(single != doubled){
            return true;
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna