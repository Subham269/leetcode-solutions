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
    public boolean isPalindrome(ListNode head) 
    {
        ListNode prev=null,curr=null,nxt=null;
        ListNode start;
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        
        while(slow!=null)
        {
            nxt=slow.next;
            curr=slow;
            curr.next=prev;
            prev=curr;
            slow=nxt;
        }
        start=head;
        while(prev!=null && start!=null)
        {
            if(prev.val!=start.val)
            return false;
            prev=prev.next;
            start=start.next;
        }
        return true;
    }
}