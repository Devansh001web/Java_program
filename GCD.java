import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = Math.abs(scanner.nextInt());

        System.out.print("Enter the second number: ");
        int b = Math.abs(scanner.nextInt());

        
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        
        System.out.println("GCD is: " + a);

        scanner.close();
    }
}
