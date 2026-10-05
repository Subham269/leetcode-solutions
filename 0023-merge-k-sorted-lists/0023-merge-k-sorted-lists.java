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
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> list = new ArrayList<>(5_000_000);
        for(int i=0;i<lists.length;i++)
        {
            ListNode head=lists[i];
            while(head!=null)
            {
                list.add(head.val);
                head=head.next;
            }
        }
        list.sort(Comparator.naturalOrder());
        ListNode dummy = new ListNode(0);
        ListNode head=dummy;
        for(int i=0;i<list.size();i++)
        {
            head.next=new ListNode(list.get(i));
            head=head.next;
        }
        return dummy.next;
    }
}