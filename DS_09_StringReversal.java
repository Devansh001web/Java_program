// String Reversal
public class DS_09_StringReversal {
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    
    public static String reverseManual(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
    
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("Original: " + str);
        System.out.println("Reversed (using StringBuilder): " + reverseString(str));
        System.out.println("Reversed (manual): " + reverseManual(str));
    }
}
