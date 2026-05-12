public class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class LinkedList {
    private ListNode head;
    private ListNode tail;
    private int size;

    public LinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public int get(int index) {
        if(index< 0 || index>=size){
            return -1;
        }

        ListNode curr = head;
        for(int i =0;i<index;i++){
            curr = curr.next;
        }

        return curr.val;

    }

    public void insertHead(int val) {
        ListNode newHead = new ListNode(val);
        newHead.next = head;
        head = newHead;

        if(size==0){
            tail = newHead;
        }

          size++;
    }

    public void insertTail(int val) {
        ListNode newTail = new ListNode(val);

        if(size==0){
            head = newTail;
            tail = newTail;
        }
        else{
            tail.next = newTail;
            tail = newTail;
        }
        size++;
    }

    public boolean remove(int index) {
        if(index<0 || index>=size){
            return false;
        }

        if(index==0){
            head = head.next;
            size--;
            if (size == 0) tail = null;

            return true;
        }

        ListNode prev = head;
        for (int step = 0; step < index - 1; step++) {
            prev = prev.next;
        }

        ListNode toRemove = prev.next;

        prev.next = toRemove.next;

        if (toRemove == tail) {
            tail = prev;
        }

        size--;
        return true;


    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> res = new ArrayList<>();

        
        ListNode cur = head;
        int idx = 0;
        while (cur != null) {
            res.add(cur.val);
            cur = cur.next;
        }

        
        return res;
    }
}
