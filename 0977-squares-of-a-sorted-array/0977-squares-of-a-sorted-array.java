class Solution {
    public int[] sortedSquares(int[] nums) {
        // for(int i = 0; i < nums.length; i++){
        //     nums[i] = nums[i]*nums[i];
        // }
        // Arrays.sort(nums);
        // return nums;
        int[] a = new int[nums.length];
        int n = nums.length;
        int low = 0;
        int high = nums.length - 1;
        while(low<=high){
            int leftv=nums[low]*nums[low];
            int rightv = nums[high]*nums[high];
            if(leftv>rightv){
                a[n-1] = leftv;
                low++;
                n--;
            }
            else{
                a[n-1] = rightv;
                n--;
                high--;
            }
        }
        return a;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna