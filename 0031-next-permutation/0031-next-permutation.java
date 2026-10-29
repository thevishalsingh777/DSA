class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while(i >= 0 && nums[i]  >= nums[i+1]) i--;
        if(i>=0){
            int j = nums.length-1;
            while(j>=0 && nums[j] <= nums[i]) j--;
            swap(nums,i,j);
        }
        reverse(nums,i+1);
    }
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void reverse(int[] nums,int start){
        int i = start;
        int j = nums.length - 1;
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna