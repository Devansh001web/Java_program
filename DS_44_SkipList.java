// Skip List
public class DS_44_SkipList {
    class Node {
        int key;
        Node[] forward;
        Node(int key, int level) {
            this.key = key;
            this.forward = new Node[level + 1];
        }
    }
    
    private int maxLevel = 4;
    private Node head = new Node(-1, maxLevel);
    private int currentLevel = 0;
    
    public void insert(int key) {
        int level = (int) (-Math.log(Math.random()) / Math.log(2)) % maxLevel;
        if (level > currentLevel) currentLevel = level;
        
        Node[] update = new Node[level + 1];
        Node current = head;
        
        for (int i = currentLevel; i >= 0; i--) {
            while (current.forward[i] != null && current.forward[i].key < key) {
                current = current.forward[i];
            }
            update[i] = current;
        }
        
        Node newNode = new Node(key, level);
        for (int i = 0; i <= level; i++) {
            newNode.forward[i] = update[i].forward[i];
            update[i].forward[i] = newNode;
        }
    }
    
    public boolean search(int key) {
        Node current = head;
        for (int i = currentLevel; i >= 0; i--) {
            while (current.forward[i] != null && current.forward[i].key < key) {
                current = current.forward[i];
            }
        }
        return current.forward[0] != null && current.forward[0].key == key;
    }
}
