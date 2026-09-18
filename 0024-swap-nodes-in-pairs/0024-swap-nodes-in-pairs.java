/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) 
    {
        if(head==null || head.next==null)
        return head;

        ListNode dummy = new ListNode(0);
        ListNode prev=null,curr=null;
        ListNode start=dummy;
        start.next=head;
        while(start.next!=null&&start.next.next!=null)
        {
            prev=start.next;
            curr=start.next.next;
            ListNode nxt=curr.next;
            curr.next=prev;
            prev.next=nxt;
            start.next=curr;
            start=prev;
        }
        return dummy.next;
    }
}