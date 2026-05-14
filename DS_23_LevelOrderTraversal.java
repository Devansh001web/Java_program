// Tree - Level Order Traversal (BFS)
public class DS_23_LevelOrderTraversal {
    class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
        }
    }
    
    public void levelOrder(Node root) {
        if (root == null) return;
        java.util.Queue<Node> queue = new java.util.LinkedList<>();
        queue.add(root);
        
        while (!queue.isEmpty()) {
            Node curr = queue.poll();
            System.out.print(curr.data + " ");
            
            if (curr.left != null) queue.add(curr.left);
            if (curr.right != null) queue.add(curr.right);
        }
    }
    
    public static void main(String[] args) {
        DS_23_LevelOrderTraversal tree = new DS_23_LevelOrderTraversal();
        Node root = tree.new Node(1);
        root.left = tree.new Node(2);
        root.right = tree.new Node(3);
        root.left.left = tree.new Node(4);
        root.left.right = tree.new Node(5);
        
        System.out.print("Level Order: ");
        tree.levelOrder(root);
        System.out.println();
    }
}
