/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode tmp = null;
        ListNode result = null;
        
        int carry = 0, sum = 0; //corry保存进位信息
        while(l1 != null || l2 != null || carry != 0) {
            sum = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + carry;
            carry = sum / 10;
            
            ListNode node = new ListNode(sum % 10); //如果产生了进位则添加一个额外结点
            if(tmp == null) {
                tmp = node;
                result = tmp;
            } else {
                tmp.next = node;
                tmp = tmp.next;
            }
            
            l1 = (l1 == null) ? null : l1.next;
            l2 = (l2 == null) ? null : l2.next;
        }
        return result;
    }
}