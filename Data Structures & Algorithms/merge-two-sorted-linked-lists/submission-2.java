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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
         if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode l1Curr = list1;
        ListNode l2Curr = list2;

        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        while (l1Curr != null && l2Curr != null) {
            if (l1Curr.val > l2Curr.val) {
                tail.next = l2Curr;        // attach l2 node
                l2Curr = l2Curr.next;
            } else {
                tail.next = l1Curr;        // attach l1 node
                l1Curr = l1Curr.next;
            }
            tail = tail.next;
        }

        // attach leftover list
        tail.next = (l1Curr != null) ? l1Curr : l2Curr;

        return dummy.next;
    }
}