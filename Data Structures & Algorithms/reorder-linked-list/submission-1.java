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
    public void reorderList(ListNode head) {
        if(head==null || head.next == null){
            return;
        }
        ListNode fast = head;
        ListNode slow  = head;

        while(fast!=null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prev = null;
        ListNode curr = slow;

        while(curr!=null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        ListNode t1 = head;
        ListNode t2 = prev;

        while(t2.next != null){
            ListNode temp1 = t1.next;
            ListNode temp2 = t2.next;

            t1.next = t2;
            t2.next = temp1;

            t1 = temp1;
            t2 = temp2;

        }

        
    }
}
