/*
1. 初始化栈 S。
2. 一次处理表达式的每个括号。
3. 如果遇到开括号，我们只需将其推到栈上即可。这意味着我们将稍后处理它，让我们简单地转到前面的 子表达式。
4. 如果我们遇到一个闭括号，那么我们检查栈顶的元素。如果栈顶的元素是一个 相同类型的 左括号，那么我们将它从栈中弹出并继续处理。否则，这意味着表达式无效。
5. 如果到最后我们剩下的栈中仍然有元素，那么这意味着表达式无效。
*/

class Solution {
    public boolean isValid(String str) {
        HashMap<Character, Character> map = new HashMap<>(3);
        map.put('{','}');
        map.put('[',']');
        map.put('(',')');
        int index = 0;
        Stack<Character> stack = new Stack<>();
        Character sta;  
        while (index<str.length()) {
            //使用charAt方法获取当前位置的字符
            char s =str.charAt(index);
            if (map.containsKey(s)) {
                stack.push(s);
                index++;
            } else {
                sta = stack.empty() ? '#' : stack.pop();
                if (!Objects.equals(s, map.get(sta))) {
                    return false;
                } else {
                    index++;
                }
            }
        }
        return stack.isEmpty();
    }
}