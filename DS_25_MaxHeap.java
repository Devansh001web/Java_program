// Max Heap Implementation
public class DS_25_MaxHeap {
    private int[] heap;
    private int size;
    
    public DS_25_MaxHeap(int capacity) {
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
        while (index > 0 && heap[(index - 1) / 2] < heap[index]) {
            swap(index, (index - 1) / 2);
            index = (index - 1) / 2;
        }
        size++;
    }
    
    public int extractMax() {
        if (size == 0) return -1;
        int max = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapify(0);
        return max;
    }
    
    private void heapify(int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        
        if (left < size && heap[left] > heap[largest]) largest = left;
        if (right < size && heap[right] > heap[largest]) largest = right;
        
        if (largest != i) {
            swap(i, largest);
            heapify(largest);
        }
    }
    
    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
    
    public static void main(String[] args) {
        DS_25_MaxHeap heap = new DS_25_MaxHeap(10);
        heap.insert(10);
        heap.insert(20);
        heap.insert(15);
        heap.insert(30);
        System.out.println("Max: " + heap.extractMax());
        System.out.println("Max: " + heap.extractMax());
    }
}
