class Solution {
    public int countDigits(int num) {
        int m = num;
        int div = 0;
        while(m > 0){
            int r = m % 10;
            if(num % r == 0){
                div = div + 1;
            }
            m = m / 10;
        }
        return div;
    }
}