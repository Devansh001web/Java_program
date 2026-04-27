import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter annual rate of interest (percent): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter time in years: ");
        double time = scanner.nextDouble();

        System.out.print("Enter number of times interest is compounded per year: ");
        double n = scanner.nextDouble();

        
        double amount = principal * Math.pow(1 + (rate / 100) / n, n * time);
        double compoundInterest = amount - principal;

       
        System.out.println("Compound interest is: " + compoundInterest);

        scanner.close();
    }
}
