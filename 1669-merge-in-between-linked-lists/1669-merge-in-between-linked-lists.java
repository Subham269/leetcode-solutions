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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) 
    {
        ListNode dummy = new ListNode(0);
        ListNode start1=list1,end1=list1,start2=list2,head=dummy;
        for(int i=0;i<=b;i++)
        {
            end1=end1.next;
        }
        head.next=start1;
        for(int i=0;i<a;i++)
        {
            head=head.next;
        }
        head.next=start2;
        head=head.next;
        
        while(head.next!=null)
        {
            head=head.next;
        }
        head.next=end1;
        return dummy.next;
    }
}