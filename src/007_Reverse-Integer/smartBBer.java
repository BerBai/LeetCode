class Solution {
    public int reverse(int x) {
        int z=0;
        int n=0;
        while(x!=0) {
            n++;
            if(x<0) {
                if(z<Integer.MIN_VALUE/10) {//判断是否超过了Integer范围，若在未超过Integer.MIN_VALUE/10，则在下一位是安全的
                    return 0;
                }
            }
            else {
                if(z>Integer.MAX_VALUE/10) {//同上
                    return 0;
                }
            }
            z = z * 10 + x % 10;
            x /= 10;
        }
        return z;
    }
}