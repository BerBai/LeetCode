//令f(x)表示正整数x末尾所含有的“0”的个数，则有：
//当0 < n < 5时，f(n!) = 0;
//当n >= 5时，f(n!) = k + f(k!), 其中 k = n / 5（取整）。

class Solution {
    public int trailingZeroes(int n) {
        int ans = 0;
        while(n >= 5) {
            n /= 5;
            ans += n;
        }
        return ans;
    }
}