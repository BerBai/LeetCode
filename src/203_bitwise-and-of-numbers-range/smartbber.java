class Solution {
    
    //暴力
    public int rangeBitwiseAnd(int m, int n) {
        int ans = n;
        for(int i = m; i < n; i++) {
            ans = ans & i;
        }
        
        return ans;
    }
    
    //
    public int rangeBitwiseAnd1(int m, int n) {
        int ans = m & n;
        int len = n - m + 1; 
        int i = 1;
        if(len > 2) {
            while(true) {
                if(i >= len - 1) {
                    ans = ans & (Integer.MAX_VALUE - i);
                    break;
                }
                i = (i << 1) + 1;
            }
        }
        //System.out.println(Integer.MAX_VALUE);
        return ans;
    }
}
