class Solution {
    public boolean containsDuplicate(int[] nums) {
        // boolean bool = false;
        // Arrays.sort(nums);
        // for(int i = 0; i < nums.length; i++){
        //     for(int j = 0; j < nums.length; j++){
        //         if(i==j){
        //             continue;
        //         }
        //         if(nums[i] == nums[j]){
        //             bool = true;
        //             break;
        //         }
        //     }
        // }
        // return bool;
        Arrays.sort(nums);
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna