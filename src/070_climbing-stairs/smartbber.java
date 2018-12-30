// 找规律，得出f(n) = f(n-1) + f(n-2), n>=3
class Solution {
    public int climbStairs(int n) {
        int[] ans = new int[n + 3]; // 保留足够的数组长度赋初始值
        ans[0] = 0;
        ans[1] = 1;
        ans[2] = 2;
        for(int i = 3;i<=n;i++) {
            ans[i] = ans[i-1] + ans[i-2];
        }
        return ans[n];
    }
}
