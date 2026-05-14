// Circular Linked List
public class DS_18_CircularLinkedList {
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    
    private Node head;
    
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head;
        }
    }
    
    public void display() {
        if (head == null) return;
        Node current = head;
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != head);
        System.out.println("(back to head)");
    }
    
    public static void main(String[] args) {
        DS_18_CircularLinkedList list = new DS_18_CircularLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.display();
    }
}
