class Solution {
    public String multiply(String num1, String num2) {
        int len1 = num1.length() - 1;
        int len2 = num2.length() - 1;
        if(len1 < 0 || len2 < 0) {
            return "";
        }
        int ans[] = new int[len1 + len2 + 2];
        for(int i = len1; i >= 0; i--) {
            for(int j = len2; j >= 0; j--) {
                int bitmul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                bitmul += ans[i + j + 1]; //加低位
                ans[i + j] += bitmul / 10;
                ans[i + j + 1] = bitmul % 10;
            }
        }
        StringBuilder sans = new StringBuilder();
        //去掉前导零
        int i = 0;
        while(i < ans.length - 1 && ans[i] == 0) {
            i++;
        }
        for(;i < ans.length; i++) {
            sans.append(ans[i]);
        }
        return sans.toString();
        
         
    }
}