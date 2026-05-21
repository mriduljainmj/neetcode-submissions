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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // find the length
        ListNode curr = head;
        int length = 0;
        while(curr!=null){
            length++;
            curr = curr.next;
        }
        int newN = length - n;
         if(length == n ){
            return head.next;
         }

        ListNode prev = head;

        for(int i =0;i<newN-1;i++){
            prev = prev.next;
        }


        prev.next = prev.next.next;

        return head;
        

    }
}
