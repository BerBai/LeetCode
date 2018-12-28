class Solution {
    public String addBinary(String a, String b) {
        StringBuilder ans = new StringBuilder();
        int cur = 0;
        for(int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--) {
            int it = i >= 0 ? a.charAt(i) - '0' : 0;
            int jt = j >= 0 ? b.charAt(j) - '0' : 0;
            int c = jt + it + cur;
            cur = 0;   //计算完记得清零
            if(c > 1) 
                cur = 1;
            if(c == 2 || c == 0) {
                ans.insert(0, "0");
            } else {
                ans.insert(0, "1");
            }
        }
        if(cur == 1) {
            ans.insert(0,"1");
        }
        a = "" + ans;
        return a;
    }
}