// Binary Search Tree - Search Operation
public class DS_20_BinarySearchTree {
    class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
        }
    }
    
    private Node root;
    
    public void insert(int data) {
        root = insertRec(root, data);
    }
    
    private Node insertRec(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else {
            root.right = insertRec(root.right, data);
        }
        return root;
    }
    
    public boolean search(int key) {
        return searchRec(root, key);
    }
    
    private boolean searchRec(Node root, int key) {
        if (root == null) return false;
        if (root.data == key) return true;
        if (key < root.data) return searchRec(root.left, key);
        return searchRec(root.right, key);
    }
    
    public static void main(String[] args) {
        DS_20_BinarySearchTree bst = new DS_20_BinarySearchTree();
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        System.out.println("Search 30: " + bst.search(30));
        System.out.println("Search 100: " + bst.search(100));
    }
}
