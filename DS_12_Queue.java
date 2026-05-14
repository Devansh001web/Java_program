// Queue Implementation using Array
public class DS_12_Queue {
    private int[] queue;
    private int front, rear;
    private int size;
    
    public DS_12_Queue(int size) {
        this.size = size;
        queue = new int[size];
        front = -1;
        rear = -1;
    }
    
    public void enqueue(int x) {
        if (rear < size - 1) {
            if (front == -1) front = 0;
            queue[++rear] = x;
            System.out.println(x + " enqueued");
        } else {
            System.out.println("Queue overflow");
        }
    }
    
    public int dequeue() {
        if (front > rear || front == -1) {
            System.out.println("Queue underflow");
            return -1;
        }
        return queue[front++];
    }
    
    public void display() {
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        DS_12_Queue q = new DS_12_Queue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        System.out.println("Dequeued: " + q.dequeue());
        q.display();
    }
}
