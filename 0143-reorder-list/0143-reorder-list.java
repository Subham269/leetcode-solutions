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
    public void reorderList(ListNode head) 
    {
        ListNode slow=head,fast=head,prev=null,nxt=null,start=head,nxt1=null;
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode second=slow.next;
        slow.next=null;
        while(second!=null)
        {
            nxt=second.next;
            second.next=prev;
            prev=second;
            second=nxt;
        }
        while(prev!=null&&head!=null)
        {
            nxt=head.next;
            nxt1=prev.next;
            head.next=prev;
            prev.next=nxt;
            head=nxt;
            prev=nxt1;
        }
    }
}