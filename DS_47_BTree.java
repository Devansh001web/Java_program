// B-Tree
public class DS_47_BTree {
    class BNode {
        int[] keys;
        BNode[] children;
        int keyCount;
        boolean isLeaf;
        
        BNode(boolean isLeaf) {
            this.isLeaf = isLeaf;
            this.keys = new int[3];
            this.children = new BNode[4];
            this.keyCount = 0;
        }
    }
    
    private BNode root;
    private int maxDegree = 3;
    
    public DS_47_BTree() {
        root = new BNode(true);
    }
    
    public void insert(int key) {
        BNode curr = root;
        if (curr.keyCount == maxDegree - 1) {
            BNode oldRoot = curr;
            root = new BNode(false);
            root.children[0] = oldRoot;
        }
    }
}
