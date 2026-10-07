class Solution {
    public int maxZeros(int[][] arr) {
        // code here
        int ans = -1;
        int maxzeroes = 0;
        for(int i = 0; i < arr.length; i++){
        int count = 0;
            for(int j = 0; j < arr[0].length; j++){
                if(arr[j][i] == 0){
                    count++;
                }
            }
            if(count>maxzeroes){
                maxzeroes = count;
                ans = i;
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna