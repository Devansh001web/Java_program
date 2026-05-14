// Find Maximum and Minimum in Array
public class DS_04_MaxMin {
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }
    
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }
        return min;
    }
    
    public static void main(String[] args) {
        int[] arr = {34, 15, 88, 2, 50};
        System.out.println("Max: " + findMax(arr));
        System.out.println("Min: " + findMin(arr));
    }
}
