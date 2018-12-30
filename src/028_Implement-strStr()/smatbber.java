/*
    strStr1()调用了indexOf()
    strStr()实现了indexOf()，使用了charAt()函数
    strStr3()使用了equals()和contains()以及split()函数

    charAt(int) 取 String 上某个位置的 字符
    equals()方法主要用于比较两个对象是否相等,返回Boolean类型
    contains()方法是判断是否存在包含关系，返回boolean类型
    split() 方法用于把一个字符串分割成字符串数组
*/

class Solution {
    public int strStr1(String haystack, String needle) {
        if(needle.length() == 0) {
            return 0;
        } else {
            return haystack.indexOf(needle); //直接调用indexOf()实现
        }
    }
    
    public int strStr(String haystack, String needle) {
        if(needle.length() == 0) { //当noodle为空应该返回0
            return 0;
        } else if(needle.length() > haystack.length()) { //当needle长度大于haystack，返回-1
            return -1;
        } else {
            char first = needle.charAt(0);
            int max = haystack.length() - needle.length();
            for(int i = 0; i <= max; i++) {
                if(haystack.charAt(i) != first) {
                    while(++i <= max && haystack.charAt(i) != first);
                }
                if(i <= max) {
                    int j = i + 1;
                    int end = j + needle.length() - 1;
                    for(int k = 1; j < end && haystack.charAt(j) == needle.charAt(k); j++, k++);
                    if(j == end) {
                        return i;
                    }
                }
            }
            return -1;
        }
    }
    public int strStr3(String haystack, String needle) {
        if(needle.equals("")||haystack.equals(needle)){
            return 0;
        }
        int index=-1;
        if(haystack.contains(needle)){
            String[] str=haystack.split(needle);
            if(str.length>=1){
                index=str[0].length();
            }else {
                index=0;
            }
        }else{
                index=-1;
            }
        return index;
    }
    
}