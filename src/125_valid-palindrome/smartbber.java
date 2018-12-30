class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[\\pP\\ \\p{Punct}]",""); //留下字母、数字
        s = s.toLowerCase();
        System.out.println(s);
        for(int i = 0, j = s.length() - 1; i < j; i++, j--){
            if(s.charAt(i) != s.charAt(j))
                return false;
        }
        return true;
    }
}