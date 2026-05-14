// LRU Cache Implementation
public class DS_38_LRUCache {
    class Node {
        int key, value;
        Node prev, next;
        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
    
    private int capacity;
    private java.util.HashMap<Integer, Node> map = new java.util.HashMap<>();
    private Node head = new Node(0, 0);
    private Node tail = new Node(0, 0);
    
    public DS_38_LRUCache(int capacity) {
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if (!map.containsKey(key)) return -1;
        Node node = map.get(key);
        remove(node);
        add(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        if (map.containsKey(key)) {
            remove(map.get(key));
        }
        Node node = new Node(key, value);
        add(node);
        map.put(key, node);
        if (map.size() > capacity) {
            remove(head.next);
            map.remove(head.next.key);
        }
    }
    
    private void add(Node node) {
        Node prev = tail.prev;
        prev.next = node;
        node.prev = prev;
        node.next = tail;
        tail.prev = node;
    }
    
    private void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
}
