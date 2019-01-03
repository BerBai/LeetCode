/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null) {
            return null;
        }
        ListNode p = head, last = head;
        
        while(head.next != null) {
            p = head.next;
            head.next = p.next;
            p.next = last;
            last = p;
        }
        return last;
    }
}