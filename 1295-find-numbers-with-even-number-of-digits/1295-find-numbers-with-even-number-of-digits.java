class Solution {
    public int findNumbers(int[] nums) {
        int even_count = 0;
        int numberOfDigits = 0;
        for(int i = 0; i < nums.length; i++){
            numberOfDigits = 0;
            while(nums[i] != 0){
                nums[i] = nums[i] / 10;
                numberOfDigits++; 
            }
            if(numberOfDigits % 2 == 0){
                even_count++;
            }
        }
        return even_count++;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna