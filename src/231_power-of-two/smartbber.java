//与运算
//二的幂的二进制都是1开头，尾部都是零，本身与（本身-1）与运算即可判断

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0)
            return false;
        if((n & (n - 1)) == 0)
            return true;
        return false;
    }
}
