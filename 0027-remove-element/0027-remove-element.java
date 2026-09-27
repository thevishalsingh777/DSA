class Solution {
    public int removeElement(int[] nums, int val) {
      int k = 0;
      int n = nums.length;
      for(int i = 0; i < n; i++){
        if(nums[i] != val){
            nums[k] = nums[i];
            k++;
        }
      }  
      return k;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna