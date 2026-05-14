// Doubly Linked List
public class DS_17_DoublyLinkedList {
    class Node {
        int data;
        Node next, prev;
        Node(int data) {
            this.data = data;
            this.next = this.prev = null;
        }
    }
    
    private Node head;
    
    public void insertEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }
    
    public void displayForward() {
        System.out.print("Forward: ");
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }
    
    public void displayBackward() {
        Node current = head;
        while (current != null && current.next != null) {
            current = current.next;
        }
        System.out.print("Backward: ");
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.prev;
        }
        System.out.println("null");
    }
    
    public static void main(String[] args) {
        DS_17_DoublyLinkedList list = new DS_17_DoublyLinkedList();
        list.insertEnd(10);
        list.insertEnd(20);
        list.insertEnd(30);
        list.displayForward();
        list.displayBackward();
    }
}
