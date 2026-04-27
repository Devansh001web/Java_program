import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the exponent: ");
        double exponent = scanner.nextDouble();

        
        double result = Math.pow(base, exponent);

       
        System.out.println(base + " raised to the power " + exponent + " is " + result);

        scanner.close();
    }
}
