class Solution {
    public static int findSum(String s) {
        // code here
        int sum = 0;
        int num = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)) num = num * 10 + (ch - '0');
            else{ 
            sum += num;
            num = 0;
            }
        }
        sum+=num;
        return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna