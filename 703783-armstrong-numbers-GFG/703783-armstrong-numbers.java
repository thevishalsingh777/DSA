class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int original = n;
        int arm = 0;
        while(n!=0){
            int digit = n % 10;
            arm = arm + (digit*digit*digit);
            n = n / 10;
        }
        if(original == arm){
            return true;
        }
        else{
            return false;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna