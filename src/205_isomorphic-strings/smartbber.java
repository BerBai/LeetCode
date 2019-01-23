class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() == 0)
            return true;
        int i = 0;
        while(i < s.length()) {
            // 通过比较字符的位置来判断是否为同构字符串
            if(s.indexOf(s.charAt(i)) != t.indexOf(t.charAt(i)))
                return false;
            i++;
        }

        return true;
    }
}