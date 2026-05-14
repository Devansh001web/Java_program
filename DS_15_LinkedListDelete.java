// Linked List - Delete Node
public class DS_15_LinkedListDelete {
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
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    
    public void delete(int key) {
        if (head == null) return;
        if (head.data == key) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.data == key) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }
    
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    
    public static void main(String[] args) {
        DS_15_LinkedListDelete list = new DS_15_LinkedListDelete();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.display();
        list.delete(20);
        list.display();
    }
}
