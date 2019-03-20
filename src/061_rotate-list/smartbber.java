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
        ListNode p1 = head, end = null;//end标记尾节点
        //计算出链表长度
        while(p1.next != null) {
            len++;
            p1 = p1.next;
        }
        int move = len - k % len; //计算要向左循环的次数，题目为向右
        end = p1; //p1为尾结点
        p1.next = head; //修改为循环链表
        p1 = head; //p1指向头结点
        while(move!=0) {
            p1 = p1.next;
            end = end.next;
            move--;
        }
       end.next = null; //断开链表
        return p1;
    }
}