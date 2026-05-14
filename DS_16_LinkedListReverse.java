// Linked List - Reverse
public class DS_16_LinkedListReverse {
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
    
    public void reverse() {
        Node prev = null, current = head, next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
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
        DS_16_LinkedListReverse list = new DS_16_LinkedListReverse();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        System.out.print("Original: ");
        list.display();
        list.reverse();
        System.out.print("Reversed: ");
        list.display();
    }
}
