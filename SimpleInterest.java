import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter rate of interest (percent): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter time in years: ");
        double time = scanner.nextDouble();

        
        double interest = (principal * rate * time) / 100;

        
        System.out.println("Simple interest is: " + interest);

        scanner.close();
    }
}
