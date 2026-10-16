class Solution {
    public ArrayList<Integer> sumTriangles(int mat[][]) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int n = mat.length;
        int m = mat[0].length;
        int sum = 0;
        for(int i = 0; i < n; i++){
            for(int j = i; j < m; j++){
                sum += mat[i][j];
            }
        }
        ans.add(sum);
        int sum2 = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j <=i; j++){
                sum2 += mat[i][j];
            }
        }
        ans.add(sum2);
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna