//26进制转10进制

class Solution {
    public int titleToNumber(String s) {
        int count = 1, ans = 0;
        for(int i = 0; i < s.length(); i++) {
            ans += Math.pow(26, s.length() - i - 1) * (s.charAt(i) - 64);
        }
        
        return ans;
    }
}