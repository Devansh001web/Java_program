// AVL Tree (Self-balancing BST)
public class DS_45_AVLTree {
    class Node {
        int key, height;
        Node left, right;
        Node(int key) {
            this.key = key;
            this.height = 1;
        }
    }
    
    private Node root;
    
    private int getHeight(Node node) {
        return node == null ? 0 : node.height;
    }
    
    private int getBalance(Node node) {
        return node == null ? 0 : getHeight(node.left) - getHeight(node.right);
    }
    
    public void insert(int key) {
        root = insertRec(root, key);
    }
    
    private Node insertRec(Node node, int key) {
        if (node == null) return new Node(key);
        
        if (key < node.key) {
            node.left = insertRec(node.left, key);
        } else {
            node.right = insertRec(node.right, key);
        }
        
        node.height = 1 + Math.max(getHeight(node.left), getHeight(node.right));
        int balance = getBalance(node);
        
        // Left-Left case
        if (balance > 1 && key < node.left.key) {
            return rotateRight(node);
        }
        // Right-Right case
        if (balance < -1 && key > node.right.key) {
            return rotateLeft(node);
        }
        // Left-Right case
        if (balance > 1 && key > node.left.key) {
            node.left = rotateLeft(node.left);
            return rotateRight(node);
        }
        // Right-Left case
        if (balance < -1 && key < node.right.key) {
            node.right = rotateRight(node.right);
            return rotateLeft(node);
        }
        
        return node;
    }
    
    private Node rotateRight(Node y) {
        Node x = y.left;
        y.left = x.right;
        x.right = y;
        y.height = 1 + Math.max(getHeight(y.left), getHeight(y.right));
        x.height = 1 + Math.max(getHeight(x.left), getHeight(x.right));
        return x;
    }
    
    private Node rotateLeft(Node x) {
        Node y = x.right;
        x.right = y.left;
        y.left = x;
        x.height = 1 + Math.max(getHeight(x.left), getHeight(x.right));
        y.height = 1 + Math.max(getHeight(y.left), getHeight(y.right));
        return y;
    }
}
