/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        // 哈希法
        Set<ListNode> listHash = new HashSet<>();
        while(head != null) {
            if(listHash.contains(head)) {
                return head;
            } else {
                listHash.add(head);
            }            
            head = head.next;
        }
        return null;
    }
}