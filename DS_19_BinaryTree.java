// Binary Tree - Insertion and Traversal
public class DS_19_BinaryTree {
    class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
            this.left = this.right = null;
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
    
    public void inorder() {
        System.out.print("Inorder: ");
        inorderRec(root);
        System.out.println();
    }
    
    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }
    
    public static void main(String[] args) {
        DS_19_BinaryTree tree = new DS_19_BinaryTree();
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.inorder();
    }
}
