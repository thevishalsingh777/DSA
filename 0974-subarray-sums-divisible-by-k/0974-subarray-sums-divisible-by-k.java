class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        // int ans = 0;
        // int n  = nums.length;
        // for(int i = 0; i < n ; i++){
        //         int sum = 0;
        //     for(int j = i; j < n; j++){
        //         sum+=nums[j];
        //         if(sum%k == 0){
        //             ans++;
        //         }
        //     }
        // }
        // return ans;
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int ans = 0;
        map.put(0,1);
        for(int val : nums){
            sum+=val;
            int rem = sum%k;
            if(rem<0){
                rem+=k;
            }
            ans+=map.getOrDefault(rem,0);
            map.put(rem,map.getOrDefault(rem,0)+1);
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna