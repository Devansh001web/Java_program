// Tree - Postorder Traversal
public class DS_22_PostorderTraversal {
    class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
        }
    }
    
    public void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }
    
    public static void main(String[] args) {
        DS_22_PostorderTraversal tree = new DS_22_PostorderTraversal();
        Node root = tree.new Node(1);
        root.left = tree.new Node(2);
        root.right = tree.new Node(3);
        root.left.left = tree.new Node(4);
        
        System.out.print("Postorder: ");
        tree.postorder(root);
        System.out.println();
    }
}
