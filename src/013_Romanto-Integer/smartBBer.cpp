/*
    规律：
    1.大数在前面，加上这个数代表的值
    2.小数在前面，则需要减去这个数代表地值
*/

class Solution {
public:
    int romanToInt(string s) {
        map<char, int> num{{'I', 1}, {'V', 5}, {'X', 10}, {'L', 50}, {'C', 100}, {'D', 500}, {'M', 1000}};
        int fnum, ans = 0;
        for(int i = 0; i < s.size(); i++) {
            fnum = num[s[i]];
            if(i <= s.size() - 1 && num[s[i]] < num[s[i+1]]) { //一定要先判断是否比后面地数小
                ans -= num[s[i]];
            } else {
                ans += num[s[i]];
            }
        }
        return ans;
    }
};