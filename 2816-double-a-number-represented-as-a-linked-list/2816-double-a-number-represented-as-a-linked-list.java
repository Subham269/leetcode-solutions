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
    public ListNode doubleIt(ListNode head) {
        ListNode reverse = reverseList(head);
        ListNode fin= new ListNode(0);
        int carry=0,nom=0;
        while(reverse!=null)
        {
            nom = (reverse.val*2)%10+carry;
            if(reverse.val*2>9)
            {
                carry=1;
            }
            else
            carry=0;
            
            ListNode nxt =new ListNode(nom);
            nxt.next=fin.next;
            fin.next=nxt;
            reverse=reverse.next;
            
        }
        if(carry==1)
        {
            ListNode nxt =new ListNode(1);
            nxt.next=fin.next;
            fin.next=nxt;
        }
        
        return fin.next;
    }
    ListNode reverseList(ListNode head)
    {
        ListNode nxt=null,prev=null;
        while(head!=null)
        {
            nxt=head.next;
            head.next=prev;
            prev=head;
            head=nxt;
        }
        return prev;
    }
}