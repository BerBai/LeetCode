/*
** 每个不包括重复字符的子串肯定是一段连续的字符区域，头设定为front，尾设定为back。那么在仅仅遍历一遍的情况下，front肯定是不断改变了，back则就是当前遍历到的位置

** 如果当前遍历到的这个字符在front后面没有出现过，那么front不需要移动，接着遍历后面的字符
** 如果当前遍历到的这个字符在front后面出现过，那么从front到当前位置这个子串肯定就有重复的字符了，此时就需要改变front的位置到出现的那个字符后面的位置。也就是和当前遍历到的这个字符上一次出现的位置的** 下一个位置。
** 在这个过程中，时刻更新最大的长度，因为front到back这段区域永远不可能有重复的字符，如果有，已经在第二步解决了
** 时间复杂度 O(n)
*/
class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        vector<int> tmp(256,-1);// 初始256大小，因为所有字符也就这么多，值记录着最后一次出现时在s中的下标，没有则是-1 
        int maxL = 0;
        int fa = 0;
        for(int i = 0; i < s.size(); i++) {
            if(tmp[s[i]] != -1 && tmp[s[i]] >= fa) { //若字符在fa之前出现过，更新fa
                fa = tmp[s[i]] + 1;
            }
            tmp[s[i]] = i; //记录字符最后出现的下标
            
            maxL = max(maxL, i - fa + 1); //计算最长字串
        }
        return maxL;
    }
};