// Hash Table using HashMap
public class DS_27_HashTable {
    public static void main(String[] args) {
        java.util.HashMap<String, Integer> map = new java.util.HashMap<>();
        
        map.put("Apple", 100);
        map.put("Banana", 150);
        map.put("Orange", 120);
        
        System.out.println("Value for Apple: " + map.get("Apple"));
        System.out.println("Contains Banana: " + map.containsKey("Banana"));
        
        System.out.println("All entries:");
        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
        
        map.remove("Banana");
        System.out.println("After removal: " + map);
    }
}
