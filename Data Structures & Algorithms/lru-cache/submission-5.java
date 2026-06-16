class LRUCache {
    private NodeList left;
    private NodeList right;
    private HashMap<Integer, NodeList> map;
    private int capacity;
    
    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        this.left = new NodeList(0,0,null,null);
        this.right = new NodeList(0,0,null, left);
        this.left.next = right;
    }

    public void insertAtRight(NodeList node){
        node.next = right;
        node.prev = right.prev;

        right.prev.next = node;
        right.prev = node;
    }

    public void detach(NodeList node){
        node.next.prev = node.prev;
        node.prev.next = node.next;
       
    }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }

        NodeList node= map.get(key);
        detach(node);
        insertAtRight(node);
        return node.val;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            NodeList node = map.get(key);
            node.val = value;
            detach(node);
            insertAtRight(node);
            return;
        }

        if(capacity == map.size()){
            NodeList node = left.next;
            map.remove(node.key);
            detach(node);
        }

        NodeList newNode = new NodeList(value, key, null,null);
        map.put(key, newNode);
        insertAtRight(newNode);
    }
}


class NodeList{
    public int val;
    public int key;
    public NodeList next;
    public NodeList prev;

    NodeList(int val, int key, NodeList next, NodeList prev){
        this.val = val;
        this.key = key;
        this.next = next;
        this.prev = prev;
    }
}


