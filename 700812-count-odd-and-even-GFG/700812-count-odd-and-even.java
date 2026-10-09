class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here
        int even = 0, odd = 0;
        // int[] ans = new int[2];
        for(int val : arr){
            if(val % 2 == 0){
                even++;
            }
            else{
                odd++;
            }
        }
        // ans[0] = odd;
        // ans[1] = even;
        return new int[]{odd,even};
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna