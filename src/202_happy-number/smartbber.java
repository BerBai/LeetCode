//所有不快乐数的数位平方和计算，最後都会进入 4 → 16 → 37 → 58 → 89 → 145 → 42 → 20 → 4 的循环中
class Solution {
    public boolean isHappy(int n) {
        if(n == 4) 
            return false;
        int tmp = 0;
        while(n != 0) {
            tmp +=Math.pow(n % 10, 2);
            n /= 10;
        }
        //System.out.println(tmp);
        if(tmp != 1) {
            return isHappy(tmp);
        } else
            return true;
    }
}