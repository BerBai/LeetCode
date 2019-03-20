/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0)
            return head;
        int len = 1;
        ListNode p1 = head, end = null;
        while(p1.next != null) {
            len++;
            p1 = p1.next;
        }
        int move = len - k % len;
        end = p1;
        p1.next = head;
        p1 = head;
        while(move!=0) {
            p1 = p1.next;
            end = end.next;
            move--;
        }
       end.next = null;
        return p1;
    }
}