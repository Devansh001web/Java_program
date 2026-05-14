// Reverse an Array
public class DS_06_ReverseArray {
    public static void reverseArray(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
    public static void printArray(int[] arr) {
        for (int x : arr) System.out.print(x + " ");
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.print("Original: ");
        printArray(arr);
        reverseArray(arr);
        System.out.print("Reversed: ");
        printArray(arr);
    }
}
