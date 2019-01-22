class Solution {
    //蛮力法 会超出时间限制
    public int countPrimes1(int n) {
        int ans = 0;
        for(int i = 2; i < n; i++) {
            if(isPrime(i) == 1)
                ans++;
        }
        return ans;
    }
    
    public int isPrime(int n) {
        for(int i = 2; i < n-1; i++) {
            if(n % i == 0) {
                return 0;
            }
        }
        return 1;
    }
    
    //将循环次数减少一半，同样超时
    public int countPrimes2(int n) {
        int ans = 0;
        for(int i = 2; i < n; i++) {
            if(isPrime2(i) == 1)
                ans++;
        }
        return ans;
    }
    
    public int isPrime2(int n) {
        for(int i = 2; i < n/2+1; i++) {
            if(n % i == 0) {
                return 0;
            }
        }
        return 1;
    }
    
    //在减少循环次数，通过，击败0.99%
    public int countPrimes3(int n) {
        int ans = 0;
        for(int i = 2; i < n; i++) {
            if(isPrime3(i) == 1)
                ans++;
        }
        return ans;
    }
    
    public int isPrime3(int n) {
        if(n == 2)
            return 1;
        for(int i = 2; i < Math.sqrt(n)+1; i++) {
            if(n % i == 0) {
                return 0;
            }
        }
        return 1;
    }
    
    //在缩短循环次数，没变化
    public int countPrimes(int n) {
        int ans = 0;
        for(int i = 2; i < n; i++) {
            if(isPrime4(i) == 1)
                ans++;
        }
        return ans;
    }
    
    public int isPrime4(int n) {
        if(n == 2)
            return 1;
        if(n % 2 != 0) {
            for(int i = 2; i < Math.sqrt(n)+1; i++) {
                if(n % i == 0) {
                    return 0;
                }
            }
        } else {
            return 0;
        }
        return 1;
    }
    
    
}