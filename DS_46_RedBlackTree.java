// Red-Black Tree (Simplified)
public class DS_46_RedBlackTree {
    class Node {
        int data;
        Node left, right, parent;
        String color;
        
        Node(int data) {
            this.data = data;
            this.color = "RED";
            this.left = this.right = this.parent = null;
        }
    }
    
    private Node root;
    
    public void insert(int key) {
        Node newNode = new Node(key);
        if (root == null) {
            newNode.color = "BLACK";
            root = newNode;
            return;
        }
        
        Node current = root;
        while (current != null) {
            if (key < current.data) {
                if (current.left == null) {
                    current.left = newNode;
                    newNode.parent = current;
                    return;
                }
                current = current.left;
            } else {
                if (current.right == null) {
                    current.right = newNode;
                    newNode.parent = current;
                    return;
                }
                current = current.right;
            }
        }
    }
    
    public void display(Node node) {
        if (node != null) {
            display(node.left);
            System.out.println(node.data + " (" + node.color + ")");
            display(node.right);
        }
    }
}
