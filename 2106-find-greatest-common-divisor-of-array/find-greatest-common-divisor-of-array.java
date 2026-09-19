class Solution {
    public static int gcd(int a, int b){
        return (a==0) ? b : gcd(b%a, a);
    }
    public int findGCD(int[] nums) {
        int max = 1;
        int min = 1000;
        for(int num: nums){
            if(num > max){
                max = num;
            }
            if(num < min){
                min = num;
            }
        }
        return gcd(min,max);
    }
}