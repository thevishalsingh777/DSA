class Solution {
    public static char getMaxOccuringChar(String s) {
        // code here
        int[] freq = new int[26];
        for(char ch : s.toCharArray()){
            freq[ch-'a']++;
        }
        int max = 0;
        int ch = 0;
        for(int i = 0; i < 26; i++){
            if(freq[i] > max){
                max = freq[i];
                ch = 97 + i;
            }
        }
        return (char)ch;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna