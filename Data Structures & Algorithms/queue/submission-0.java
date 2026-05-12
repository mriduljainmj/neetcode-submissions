class Deque {
    ListNode left;
    ListNode right;

    public Deque() {
        this.left = null;
        this.right = null;
    }

    public boolean isEmpty() {
        if(this.left == null){
            return true;
        }
        return false;
    }

    public void append(int value) {
       ListNode newNode = new ListNode(value);
       if(this.right!=null){
        this.right.next = newNode;
        this.right = this.right.next;
       }
       else{
        this.right = newNode;
        this.left = newNode;
       }
       
    }

    public void appendleft(int value) {
         ListNode newNode = new ListNode(value);
         if(this.left!=null){
            newNode.next = this.left;
            this.left = newNode;
         }
         else{
            this.left = newNode;
            this.right = newNode;
         }
    }

    public int pop() {
        if(this.left == null || this.right==null){
            return -1;
        }
          int val = this.right.val;
        if (left == right) {    
            left = right = null;
            return val;
        }
       
        ListNode curr = this.left;
        while(curr.next!=right){
            curr = curr.next;
        }
        curr.next = null;
        this.right = curr;
        return val;
    }

    public int popleft() {
        if (this.left == null) {
           return -1;
        }
        int val = this.left.val;
        this.left = this.left.next;
        if (this.left == null) {
            this.right = null;
        }
        return val;
    }
}

public static class ListNode{

    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
        this.next = null;
    }

}
