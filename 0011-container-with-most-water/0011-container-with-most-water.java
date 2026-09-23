class Solution {
    public int maxArea(int[] height) {
    //     int answer = 0;
    //     int n = height.length;
    //     for(int i = 0; i < n; i++){
    //         for(int j = i+1; j < n; j++){
    //             int length = Math.min(height[i],height[j]);
    //             int width = j - i;
    //             answer = Math.max(answer, length*width);
    //         }
    //     }
    //     return answer;
    // }
    int ans = Integer.MIN_VALUE;
    int low = 0;
    int high = height.length-1;
    while(low<high){
        int lH=height[low];
        int rH=height[high];
        int min = Math.min(lH,rH);
        ans = Math.max(ans,min*(high-low));
        if(lH<rH){
            low++;
        }
        else{
            high--;
        }
    }
    return ans;
}
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna