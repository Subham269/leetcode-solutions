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
    public ListNode reverseBetween(ListNode head, int left, int right) 
    {
        if(head==null || head.next==null)
        return head;
        ListNode dummy = new ListNode(0);
        dummy.next=head;

        ListNode before=dummy,nxt=null,prev=null,curr=null;
        int i;

        for(i=1;i<left;i++)
        {
            before=before.next;
        }

        curr=before.next;
        
        for( i=left;i<=right;i++)
        {
            nxt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nxt;
        }

        before.next.next=curr;
        before.next=prev;   
        return dummy.next ; 

    }
}