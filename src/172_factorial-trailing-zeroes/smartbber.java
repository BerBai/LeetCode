//令f(x)表示正整数x末尾所含有的“0”的个数，则有：
//当0 < n < 5时，f(n!) = 0;
//当n >= 5时，f(n!) = k + f(k!), 其中 k = n / 5（取整）。

class Solution {
    //循环
    public int trailingZeroes1(int n) {
        int ans = 0;
        while(n >= 5) {
            n /= 5;
            ans += n;
        }
        return ans;
    }
    
    //递归
    public int trailingZeroes(int n) {
        if(n < 5)
            return 0;
        else {
            return trailingZeroes(n/5) + n/5;
        }
    }
}