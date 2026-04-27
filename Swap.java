import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap with temp: a = " + a + ", b = " + b);

        
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swap without temp: a = " + a + ", b = " + b);

        scanner.close();
    }
}
