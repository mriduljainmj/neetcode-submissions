class LFUCache {    

    class DList{
        int size;
        ListNode left, right;
  

    DList(){
        this.left = new ListNode(-1,-1,-1);
        this.right = new ListNode(-1,-1,-1);
        left.next = right;
        right.prev = left;
        size = 0;
    }

    private void addNode(ListNode node){
        node.next = right;
        node.prev = right.prev;
        right.prev.next = node;
        right.prev = node;
        size++;
    }

    private void removeNode(ListNode node){
        node.next.prev = node.prev;
        node.prev.next = node.next;
        size--;
    }

    }
    private int capacity;
    private int minFreq;
    private HashMap<Integer, ListNode> map;
    private HashMap<Integer, DList> freqMap;

    public LFUCache(int capacity) {
        this.capacity = capacity;
        this.minFreq = 0;
        this.map = new HashMap<>();
        this.freqMap = new HashMap<>();
    }

    private void updateFrequency(ListNode node) {
        int oldFreq = node.freq;
        DList freqList = freqMap.get(oldFreq);
        freqList.removeNode(node);

        if(oldFreq == minFreq && freqList.size == 0){
            minFreq++;
        }
        node.freq++;

        freqMap.computeIfAbsent(node.freq, k -> new DList()).addNode(node);
    }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        
        ListNode node = map.get(key);
        updateFrequency(node);
        return node.val;
        
    }
    
    public void put(int key, int value) {
        if(capacity==0){
            return;
        }

        if(map.containsKey(key)){
            ListNode node = map.get(key);
            node.val = value;
            updateFrequency(node);
            return;
        }

        if (map.size() == capacity) {
            DList minList = freqMap.get(minFreq);
            ListNode nodeToEvict = minList.left.next;
            
            map.remove(nodeToEvict.key);
            minList.removeNode(nodeToEvict);
        }

        ListNode newNode = new ListNode(key, value, 1);
        map.put(key, newNode);
        minFreq = 1;
        
        freqMap.computeIfAbsent(1, k -> new DList()).addNode(newNode);
    }
}

class ListNode{
    int val, freq, key;
    ListNode next, prev;
    ListNode(int key, int val, int freq) {
        this.key = key;
        this.val = val;
        this.freq = freq;
    }
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */