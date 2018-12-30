/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    //递归
    public ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
        if(l1==null)
            return l2;
		if(l2==null)
            return l1;
		if(l1.val>l2.val){
			l2.next=mergeTwoLists(l2.next,l1);
			return l2;
		}
		else{
			l1.next=mergeTwoLists(l1.next,l2);
			return l1;
		}
    }
    //循环
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null)
            return l2;
		if(l2==null)
            return l1;
		ListNode temp=null;
		if(l1.val>l2.val){
			temp=l2;
			l2=l2.next;
		}
		else{
			temp=l1;
			l1=l1.next;
		}
		temp.next=null;
		ListNode ans=temp;
		while(l1!=null && l2!=null){
			if(l1.val>l2.val){
				temp.next=l2;
				l2=l2.next;
			}
			else{
				temp.next=l1;
				l1=l1.next;
			}
			temp=temp.next;
			temp.next=null;
		}
		if(l1==null)
            temp.next=l2;
		else 
            temp.next=l1;
		return ans;
    }
}