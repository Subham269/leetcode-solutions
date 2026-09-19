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
    public ListNode reverseKGroup(ListNode head, int k) 
    {
        int a=0,x=k,flag=0,count=0;
        ListNode dummy=new ListNode(0);
        ListNode dummy1=dummy,start=head,nxt=null,prev=null;
        while(start!=null)
        {
            count=0;
            ListNode temp=start;
            if(a==0)
            {
            while(temp!=null && count<k)
            {
                temp=temp.next;
                count++;
            }
            if(count<k)
            {
                flag=1;
                break;
            }
            }
            if(a!=k)
            {
                nxt=start.next;
                start.next=prev;
                prev=start;
                start=nxt;
                a++;
            }
            if(a==k)
            {
                dummy1.next=prev;
                while(x!=0)
                {
                    dummy1=dummy1.next;
                    x--;

                }
                prev=null;
                a=0;
                x=k;
            }
            
        }
        if(flag==1)
        {
            dummy1.next=start;
        }
        
       return dummy.next;
        
    }
}