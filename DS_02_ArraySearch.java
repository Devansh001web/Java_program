// Linear Search in Array
public class DS_02_ArraySearch {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9, 3};
        int target = 8;
        int result = linearSearch(arr, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
