class Solution {
    public int[][] imageSmoother(int[][] img) {
        int m = img.length;
        int n = img[0].length;
        int[][] ans = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                int sum = img[i][j];
                int count = 1;
                if(i - 1 >= 0 && j - 1 >= 0){
                    sum+=img[i - 1][j - 1];
                    count++;
                }
                if(i - 1 >= 0){
                    sum+=img[i - 1][j];
                    count++;
                }
                if(i - 1 >= 0 && j + 1 < n){
                    sum+=img[i - 1][j + 1];
                    count++;
                }
                if(j + 1 < n){
                    sum+=img[i][j + 1];
                    count++;
                }
                if(i + 1 < m && j + 1 < n){
                    sum+=img[i + 1][j + 1];
                    count++;
                }
                if(i + 1 < m){
                    sum+=img[i + 1][j];
                    count++;
                }
                if(i + 1 < m && j - 1 >= 0){
                    sum+=img[i + 1][j - 1];
                    count++;
                }
                if(j - 1 >= 0){
                    sum+=img[i][j - 1];
                    count++;
                }
                ans[i][j] = sum / count;
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna