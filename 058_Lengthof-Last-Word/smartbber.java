class Solution {
    public int lengthOfLastWord(String s) {
        int i = 0, j = s.length() - 1, k = 0;
        while(j >= 0 && s.charAt(j) == ' ') { //去掉后缀空格
            k++;
            j--;
        }
        for(i = s.length() - 1 - k; i >= 0 && s.charAt(i) != ' '; i--); //计算最后一个单词长度
        return s.length() - i - 1 - k;
    }
}