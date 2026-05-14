// Suffix Array
public class DS_42_SuffixArray {
    public static void main(String[] args) {
        String text = "banana";
        int n = text.length();
        
        String[] suffixes = new String[n];
        for (int i = 0; i < n; i++) {
            suffixes[i] = text.substring(i);
        }
        
        java.util.Arrays.sort(suffixes);
        
        System.out.println("Suffix Array for '" + text + "':");
        for (String suffix : suffixes) {
            System.out.println(suffix);
        }
    }
}
