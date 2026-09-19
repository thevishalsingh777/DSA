class Solution {
    int sumOfSeries(int n) {
        int sum = 0;// code here
        for(int i = 1; i <= n; i++){
            sum = sum + i * i * i; 
        }
        return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna