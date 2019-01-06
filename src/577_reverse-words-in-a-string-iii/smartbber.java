class Solution {
    public String reverseWords(String s) {
        StringBuilder rS = new StringBuilder();
        for(int i = 0, j = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                j = i;
                rS.insert(j, s.charAt(i));
                j++;
            }
            rS.insert(j, s.charAt(i));
        }
        return rS.toString().trim();//去掉末尾的空格
    }
}