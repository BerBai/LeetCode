class Solution {
    public String countAndSay(int n) {
        String s = "1";
        int k;
        for(int i = 1; i < n; i++) {
            StringBuilder tmp = new StringBuilder(); //当对字符串进行修改的时候，需要使用 StringBuffer 和 StringBuilder 类
            //常使用StringBuilder()
            for(int j = 0; j < s.length(); j = k) {
                k = j;
                while(k < s.length() && s.charAt(k) == s.charAt(j)) {
                    k++;
                }
                tmp.append(k - j).append(s.charAt(j)); //StringBuilder中的append方法，相当于 string 的 +
            }
            s = tmp.toString();
        }
        return s;
    }
}