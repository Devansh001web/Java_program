// Array Pair Sum
public class DS_05_PairSum {
    public static void findPairs(int[] arr, int target) {
        System.out.println("Pairs with sum " + target + ":");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("(" + arr[i] + ", " + arr[j] + ")");
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1, 5};
        findPairs(arr, 6);
    }
}
