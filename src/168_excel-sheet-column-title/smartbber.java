//十进制转二十六进制

class Solution {
    public String convertToTitle(int n) {
        StringBuilder ans = new StringBuilder();
        while(n != 0) {
            n--;
            int c = n % 26;
            ans.insert(0, (char)(c + 'A'));
            n = n / 26;
        }
        return ans.toString();
    }
}