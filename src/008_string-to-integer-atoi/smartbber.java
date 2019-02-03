//写的乱七八糟的，各种情况考虑全就可以了
class Solution {
    public int myAtoi(String str) {
        int ans = 0, c = 1, k = 1;
        for(int i = 0; i < str.length(); i++) {
            if(k == 1 && str.charAt(i) == ' ') {
                continue;
            } else if(k == 1 && (str.charAt(i) == '-' || str.charAt(i) == '+')) {
                k = 0;
                if(str.charAt(i) == '-')
                    c = -1;
                if(i + 1 < str.length() && (str.charAt(i + 1) > '9' || str.charAt(i + 1) < '0')){
                    break;
                }
            } else if(str.charAt(i) > '9' || str.charAt(i) < '0'){
                break;
            } else {
                k = 0;
                String tmp = String.valueOf(str.charAt(i));
                ans = ans * 10 + Integer.valueOf(tmp);
                if(i < str.length() - 1) {
                    
                    int digit = str.charAt(i + 1)-'0';
                    if(str.charAt(i + 1) > '9' || str.charAt(i + 1) < '0')
                        break;
                    if(( Integer.MAX_VALUE / 10 < ans)||( Integer.MAX_VALUE / 10 == ans && Integer.MAX_VALUE % 10< digit)){
                System.out.println(ans);
                        return c==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
                    }
                }
        } 
            }
        return ans * c;
    }
}
