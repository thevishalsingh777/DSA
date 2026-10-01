class Solution {
    public int maximumWealth(int[][] accounts) {
        int n = accounts[0].length;
        int sum = 0;
        int ans = 0;
        for(int[] val: accounts){
            sum = 0;
            for(int i = 0; i < n; i++){
                sum = sum+val[i];
            }
            ans = Math.max(sum,ans);
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna