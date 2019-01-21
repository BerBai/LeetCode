/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    //方法一
    public ListNode removeElements1(ListNode head, int val) {
        if(head == null)
            return null;
        ListNode tmp = head;
        while(tmp.next != null) {
            if(tmp.next.val == val) {
                tmp.next = tmp.next.next;
            } else {
                tmp = tmp.next;
            }
        }
        if(head.val == val) {
            head = head.next;
        }
        return head;
    }
    //方法二
    public ListNode removeElements(ListNode head, int val) {
        ListNode tHead = new ListNode(-1);
        tHead.next = head;
        ListNode tmp = tHead;
        while(tmp.next != null) {
            if(tmp.next.val == val) {
                tmp.next = tmp.next.next;
            } else {
                tmp = tmp.next;
            }
        }
        return tHead.next;
    }
}