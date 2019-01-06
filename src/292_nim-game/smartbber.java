//巴什博奕，n%(m+1)!=0时，先手总是会赢的
//只要留给对手四及四的倍数，都能赢


class Solution {
    public boolean canWinNim(int n) {
        if(n % 4 == 0) {
            return false;
        } else {
            return true;
        }
    }
}