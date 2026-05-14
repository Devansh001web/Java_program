// Tree - Height of Binary Tree
public class DS_24_TreeHeight {
    class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
        }
    }
    
    public int findHeight(Node root) {
        if (root == null) return 0;
        return 1 + Math.max(findHeight(root.left), findHeight(root.right));
    }
    
    public static void main(String[] args) {
        DS_24_TreeHeight tree = new DS_24_TreeHeight();
        Node root = tree.new Node(1);
        root.left = tree.new Node(2);
        root.right = tree.new Node(3);
        root.left.left = tree.new Node(4);
        root.left.right = tree.new Node(5);
        
        System.out.println("Height of tree: " + tree.findHeight(root));
    }
}
