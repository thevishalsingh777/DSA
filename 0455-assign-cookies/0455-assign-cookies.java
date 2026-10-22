class Solution {
    public int findContentChildren(int[] g, int[] s) {
        if(s.length == 0 || g.length == 0) return 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int n = g.length;
        int m = s.length;
        int i = 0, j = 0;
        int ans = 0;
        while (i < n && j < m) {
            if (s[j] >= g[i]) {
                ans++;
                i++;
            }
            j++;
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna