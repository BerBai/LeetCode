class Solution {
    //第一种方法
    public String longestCommonPrefix(String[] strs) {
        String tmp = new String("");
        int i, j;
        if( strs.length== 0) //数组长度为零，一定要考虑，测试用例中由这种情况
            return tmp;
        for(i = 1; i <= strs[0].length(); i++) {
            tmp = strs[0].substring(0, i); //去除前 i 个字符，赋值给 tmp
            for(j = 1; j < strs.length; j++) {
                if(strs[j].indexOf(tmp) != 0) { //当存在子串返回值 >= 0，不存在返回 -1
                    return strs[0].substring(0, i-1);
                }
            }
        }
        return tmp;
    }
    //第二种方法，参照了网上讲解
    public String longestCommonPrefix1(String[] strs) {
        if (strs.length == 0) 
            return "";
        String tmp = strs[0]; //从尾部找起
        for (int i = 1; i < strs.length; i++) { // 只要不存在串，就缩减串的规模，再进行查找
            while (strs[i].indexOf(tmp) != 0 && !tmp.isEmpty()) { // indexOf：当存在串时返回>0；不存串时返回-1
                tmp = tmp.substring(0, tmp.length() - 1);
            }
        }
        return tmp;
    }
}
