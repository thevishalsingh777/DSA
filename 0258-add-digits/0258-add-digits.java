class Solution {
    public int addDigits(int num) {
        if (num == 0)
            return 0;
        else if (num % 9 == 0)
            return 9;
        else
        return num % 9;
        // if(num < 10) return num;
        // while(num >= 10){
        //     int sum = 0;
        //     int val = num;
        //     while(val!=0){
        //         int rem = val%10;
        //         sum+=rem;
        //         val/=10;
        //     }
        //     num = sum;
        // }
        // return num;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna