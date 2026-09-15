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
    public ListNode reverseList(ListNode head) 
    {
        ListNode nxt=null,nw=null,start;
        if(head==null || head.next==null)
        return head;
        start=head;
        while(start!=null)
        {
            nxt=start.next;
            start.next=nw;
            nw=start;
            start=nxt;
        }
        return nw;
    }
}