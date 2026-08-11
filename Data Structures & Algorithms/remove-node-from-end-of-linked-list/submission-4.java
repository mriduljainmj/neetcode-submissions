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
        ListNode temp = head;
        int length = 0;
        while(temp!=null){
            length++;
            temp = temp.next;
        }
          if(n==length){
            return head.next;
        }

        int newLen = length-n;

        ListNode node = head;
        for(int i=0;i<newLen-1;i++){
            node = node.next;
        }

        node.next = node.next.next;
        return head;
    }
}
