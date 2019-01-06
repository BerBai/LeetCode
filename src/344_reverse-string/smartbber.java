class Solution {
    public String reverseString1(String s) {
        StringBuilder rS = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            rS.insert(0, s.charAt(i));
        }
        return rS.toString();
    }
    public String reverseString(String s) {
        String ss = new StringBuilder(s).reverse().toString();
        return ss;
    }
}