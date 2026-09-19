class Solution {
    public int minDays(int n) {
        int[] dp = new int[n+1];
        for(int i = 0; i <=n; i++){
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0] = -1;
        for(int score = 1; score <= n; score++){
            for(int k = 1; k*(k+1) / 2 <= score; k++){
                int points = k * (k+1)/2;
                dp[score] = Math.min(dp[score],dp[score - points] + k + 1);
            }
        }
        return dp[n];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna