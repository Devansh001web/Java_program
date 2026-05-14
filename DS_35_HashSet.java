// Set Implementation using HashSet
public class DS_35_HashSet {
    public static void main(String[] args) {
        java.util.HashSet<Integer> set = new java.util.HashSet<>();
        
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20);
        
        System.out.println("Set: " + set);
        System.out.println("Contains 20: " + set.contains(20));
        System.out.println("Size: " + set.size());
        
        set.remove(20);
        System.out.println("After removal: " + set);
        
        for (int x : set) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
