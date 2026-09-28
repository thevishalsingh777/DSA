class Solution {
    public int convertFive(int n) {
        if(n == 0){
            return 5;
        }
        else{
        int sum = 0;
        while(n!=0){
            int digit = n % 10;
            if(digit == 0){
                sum = sum * 10 + 5;
            }
            else{
                sum = sum * 10 + digit;
            }
            n /= 10;
        }
        int rev = 0;
        while(sum!=0){
            int d = sum % 10;
            rev = rev * 10 + d;
            sum/=10;
        }
        return rev;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna