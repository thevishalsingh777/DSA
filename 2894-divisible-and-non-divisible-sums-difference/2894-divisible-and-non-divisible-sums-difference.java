class Solution {
    public int differenceOfSums(int n, int m) {
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 1; i <= n; i++){
            if(i % m != 0){
                sum1 += i;
            }
            else{
                sum2 += i;
            }
        }
        return sum1 - sum2;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna