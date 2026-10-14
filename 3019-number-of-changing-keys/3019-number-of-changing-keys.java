class Solution {
    public int countKeyChanges(String s) {
        String lowercase = s.toLowerCase();
        int n = s.length();
        char[] arr = lowercase.toCharArray();
        int ans = 0;
        for(int i = 0; i < n - 1; i++){
            if(arr[i] != arr[i+1]){
                ans++;
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna