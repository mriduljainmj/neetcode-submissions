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
        ListNode currList1Head = list1;
        ListNode currList2Head = list2;
        ArrayList<Integer> sortedArray = new ArrayList<>();
        while(currList1Head!=null){
            sortedArray.add(currList1Head.val);
            currList1Head = currList1Head.next;
        }
         while(currList2Head!=null){
            sortedArray.add(currList2Head.val);
            currList2Head = currList2Head.next;
        }
        Collections.sort(sortedArray);

        ListNode newSortedHead = null;
        if(sortedArray.size()>0){
            newSortedHead = new ListNode(sortedArray.get(0));
        }
       
        ListNode curr = newSortedHead;
        
        for(int i=1;i<sortedArray.size();i++){
            curr.next = new ListNode(sortedArray.get(i));
            curr = curr.next;
        }

        return newSortedHead;

    }
}