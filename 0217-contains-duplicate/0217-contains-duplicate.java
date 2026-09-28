class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Brute Force
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
        
        //Optimal One
        // 
        Set<Integer> set = new HashSet<>();
        for(int val: nums){
            if(!set.add(val)){
                return true;
            }
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna