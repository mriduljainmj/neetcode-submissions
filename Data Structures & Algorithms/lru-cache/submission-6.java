class LRUCache {
    private Node left;
    private Node right;
    private HashMap<Integer,Node> map;
    private int cap;

    public LRUCache(int capacity) {
        this.cap = capacity;
        this.map = new HashMap<>();
        this.left = new Node(0,0, null,null);
        this.right = new Node(0,0,null,left);
        this.left.next = right;
    }

    public void insertAtRight(Node node){
        node.next = right;
        node.prev = right.prev;

        right.prev.next = node;
        right.prev = node;
        
    }

    public void detach(Node node){
        node.next.prev = node.prev;
        node.prev.next = node.next;
        
    }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }

        Node node = map.get(key);
        detach(node);
        insertAtRight(node);
        return node.val;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node node = map.get(key);
            node.val = value;
            detach(node);
            insertAtRight(node);
            return;
        }

        if(map.size()==cap){
            Node node = left.next;
            map.remove(node.key);
            detach(node);
        }
        Node newNode = new Node(value, key, null,null);
        map.put(key, newNode);
        insertAtRight(newNode);
      
    }
}

public class Node{
    private int val;
    private int key;
    private Node next;
    private Node prev;

    Node(int val, int key, Node next, Node prev){
        this.val = val;
        this.key = key;
        this.next = next;
        this.prev = prev;
    }

}
