class Solution {
    public int mySqrt(int x) {
        int i = 1;
        
        while(i < x / i) {
            i++;
        }
        if(i != 0 && i > x / i) {
            i--;
        }
        if(x < 1) 
            i = 0;
        return i;
    }
}