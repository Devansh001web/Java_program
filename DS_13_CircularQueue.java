// Circular Queue Implementation
public class DS_13_CircularQueue {
    private int[] queue;
    private int front, rear, size, count;
    
    public DS_13_CircularQueue(int size) {
        this.size = size;
        queue = new int[size];
        front = 0;
        rear = -1;
        count = 0;
    }
    
    public void enqueue(int x) {
        if (count < size) {
            rear = (rear + 1) % size;
            queue[rear] = x;
            count++;
            System.out.println(x + " enqueued");
        } else {
            System.out.println("Queue overflow");
        }
    }
    
    public int dequeue() {
        if (count > 0) {
            int x = queue[front];
            front = (front + 1) % size;
            count--;
            return x;
        }
        System.out.println("Queue underflow");
        return -1;
    }
    
    public static void main(String[] args) {
        DS_13_CircularQueue q = new DS_13_CircularQueue(4);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println("Dequeued: " + q.dequeue());
        q.enqueue(40);
        q.enqueue(50);
    }
}
