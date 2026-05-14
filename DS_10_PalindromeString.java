// String Palindrome Check
public class DS_10_PalindromeString {
    public static boolean isPalindrome(String str) {
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }
    
    public static void main(String[] args) {
        String[] strings = {"A man, a plan, a canal: Panama", "race a car", "hello"};
        for (String s : strings) {
            System.out.println(s + " -> " + (isPalindrome(s) ? "Palindrome" : "Not a palindrome"));
        }
    }
}
