class Solution {
    public boolean isPalindrome(int x) {
        boolean isTrue = false; //定义跳出标记
        String s = String.valueOf(x); //将 int 转换为 String
        String sr = new StringBuffer(s).reverse().toString(); //反转String
        if(sr.equals(s)) { //判断两者是否相等
            isTrue = true;
        }
        return isTrue;
    }
}