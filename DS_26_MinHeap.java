// Min Heap Implementation
public class DS_26_MinHeap {
    private int[] heap;
    private int size;
    
    public DS_26_MinHeap(int capacity) {
        heap = new int[capacity];
        size = 0;
    }
    
    public void insert(int x) {
        if (size == heap.length) {
            System.out.println("Heap overflow");
            return;
        }
        heap[size] = x;
        int index = size;
        while (index > 0 && heap[(index - 1) / 2] > heap[index]) {
            swap(index, (index - 1) / 2);
            index = (index - 1) / 2;
        }
        size++;
    }
    
    public int extractMin() {
        if (size == 0) return -1;
        int min = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapify(0);
        return min;
    }
    
    private void heapify(int i) {
        int smallest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        
        if (left < size && heap[left] < heap[smallest]) smallest = left;
        if (right < size && heap[right] < heap[smallest]) smallest = right;
        
        if (smallest != i) {
            swap(i, smallest);
            heapify(smallest);
        }
    }
    
    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
    
    public static void main(String[] args) {
        DS_26_MinHeap heap = new DS_26_MinHeap(10);
        heap.insert(10);
        heap.insert(5);
        heap.insert(20);
        heap.insert(2);
        System.out.println("Min: " + heap.extractMin());
        System.out.println("Min: " + heap.extractMin());
    }
}
