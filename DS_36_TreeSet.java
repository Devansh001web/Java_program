// TreeSet for Sorted Set
public class DS_36_TreeSet {
    public static void main(String[] args) {
        java.util.TreeSet<Integer> set = new java.util.TreeSet<>();
        
        set.add(50);
        set.add(30);
        set.add(70);
        set.add(20);
        set.add(40);
        
        System.out.println("TreeSet: " + set);
        System.out.println("First: " + set.first());
        System.out.println("Last: " + set.last());
        System.out.println("Lower than 40: " + set.lower(40));
        System.out.println("Higher than 40: " + set.higher(40));
        
        set.remove(30);
        System.out.println("After removal: " + set);
    }
}
