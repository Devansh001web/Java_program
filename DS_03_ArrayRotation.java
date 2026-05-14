// Array Rotation
public class DS_03_ArrayRotation {
    public static void rotateLeft(int[] arr, int d) {
        d = d % arr.length;
        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        for (int i = 0; i < arr.length - d; i++) {
            arr[i] = arr[i + d];
        }
        for (int i = 0; i < d; i++) {
            arr[arr.length - d + i] = temp[i];
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
        rotateLeft(arr, 2);
        System.out.print("Rotated: ");
        printArray(arr);
    }
}
