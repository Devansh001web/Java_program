// Tree - Preorder Traversal
public class DS_21_PreorderTraversal {
    class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
        }
    }
    
    public void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    
    public static void main(String[] args) {
        DS_21_PreorderTraversal tree = new DS_21_PreorderTraversal();
        Node root = tree.new Node(1);
        root.left = tree.new Node(2);
        root.right = tree.new Node(3);
        root.left.left = tree.new Node(4);
        
        System.out.print("Preorder: ");
        tree.preorder(root);
        System.out.println();
    }
}
