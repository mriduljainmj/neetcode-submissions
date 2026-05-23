class LRUCache {
   private int capacity;
    private HashMap<Integer, ListNode> map;
    private ListNode left, right;

    public LRUCache(int capacity) {
        this.map = new HashMap<>();
        this.capacity = capacity;
       this.left = new ListNode(0, null, null);
        this.right = new ListNode(0, null, left);
        this.left.next = right;
    }

    private void detach(ListNode node) {
        node.next.prev = node.prev;
        node.prev.next = node.next;
    }
    private void insertAtRight(ListNode node) {
        ListNode oldLast = right.prev;

        node.next = right;
        node.prev = oldLast;

        oldLast.next = node;
        right.prev = node;
    }
    public int get(int key) {
      if (!map.containsKey(key)) {
            return -1;
        }
        
        ListNode node = map.get(key);
        detach(node);
        insertAtRight(node);
        
        return node.val;
    }

    public void put(int key, int value) {
       if (map.containsKey(key)) {
            ListNode node = map.get(key);
            node.val = value;
            detach(node);
            insertAtRight(node);
            return;
        }
        
        if (map.size() == capacity) {
            ListNode lruNode = left.next; 
            
            Integer keyToRemove = null;
            for (Map.Entry<Integer, ListNode> entry : map.entrySet()) {
                if (entry.getValue() == lruNode) {
                    keyToRemove = entry.getKey();
                    break;
                }
            }
            

            if (keyToRemove != null) {
                map.remove(keyToRemove);
            }
            detach(lruNode);
        }

        ListNode nodeToAdd = new ListNode(value, null, null);
        map.put(key, nodeToAdd);
        insertAtRight(nodeToAdd);
    }
}

class ListNode {
    int val;
    ListNode next, prev;
    ListNode(int val, ListNode next, ListNode prev) {
        this.val = val;
        this.next = next;
        this.prev = prev;
    }
}
