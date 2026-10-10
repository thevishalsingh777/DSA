class Solution {
    public int countKdivPairs(int[] arr, int k) {
        // code here
        // int n = arr.length;
        // int ans = 0;
        // for(int i = 0; i < n; i++){
        //     for(int j = i+1; j < n; j++){
        //     if(i==j){
        //         continue;
        //     }
        //     if((arr[i]+arr[j])%k == 0){
        //         ans++;
        //     }
        // }
        
            
        // }
        // return ans;
        int n = arr.length;
        Map<Integer,Integer> map = new HashMap<>();
        int ans = 0;
        for(int val :  arr){
            int rem = val % k;
            int req = (k-rem)%k;
            ans+=map.getOrDefault(req,0);
            map.put(rem,map.getOrDefault(rem,0)+1);
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna