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
    public ListNode reverseEvenLengthGroups(ListNode head) {
        ListNode dummy1 = new ListNode(0);
        ListNode dummy=dummy1,start=head,prev=null,nxt=null,temp;
        int count =1,flag=0;
        while(start!=null)
        {
            temp=start;
            int c=0;
            while(temp!=null&&c<count)
            {
                temp=temp.next;
                c++;
            }
            if(c==count)
            {
                if(count%2==0)
                flag=1;
                else
                flag=0;
            }
            if(c<count)
            {
                if(c%2==0)
                flag=1;
                else
                flag=0;
            }
            if(flag==1)
            {
                prev= null;
                ListNode groupStart=start;
                int a=0;
                while(a<c)
                {
                    nxt=start.next;
                    start.next=prev;
                    prev=start;
                    start=nxt;
                    a++;
                }
                groupStart.next=temp;
                dummy.next=prev;
            }
            else
            {
                dummy.next=start;
                for(int i=0;i<c;i++)
                {
                    start=start.next;
                }
            }
            for(int i=0;i<c;i++)
            {
                dummy=dummy.next;
            }
            count++;
        }

        return dummy1.next;
    }
}