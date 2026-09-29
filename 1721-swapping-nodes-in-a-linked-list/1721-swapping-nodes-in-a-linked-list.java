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
    public ListNode swapNodes(ListNode head, int k) 
    {
        ListNode start=head,prev1=null,curr1=start,prev2=null,curr2=start,nxt=null;
        int len=0;
        while(start!=null)
        {
            start=start.next;
            len++;
        }
        start=head;
        for(int i=1;i<k;i++)
        {
            prev1=start;
            start=start.next;
            curr1=start;
        }
        start=head;
        for(int i=1;i<len-k+1;i++)
        {
            prev2=start;
            start=start.next;
            curr2=start;
        }
        if(Math.abs(k - (len-k+1)) == 1)
        {
            if(k<len-k+1)
            {
                if(prev1!=null)
                {
                    prev1.next=curr2;
                }
                else 
                {
                    head=curr2;
                }
                curr1.next=curr2.next;
                curr2.next=curr1;
            }
            else
            {
                if(prev2!=null)
                {
                    prev2.next=curr1;
                }
                else 
                {
                    head=curr1;
                }
                curr2.next=curr1.next;
                curr1.next=curr2;
            }
            
        }
        else if(k!=len-k+1)
        {
            if(prev1!=null)
            prev1.next=curr2;
            else
            head=curr2;
            nxt=curr2.next;
            curr2.next=curr1.next;
            if(prev2!=null)
            prev2.next=curr1;
            else 
            head=curr1;
            curr1.next=nxt;
            
        }
        return head;
    }    
}
