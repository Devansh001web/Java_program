import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int reversed = 0;
        int temp = Math.abs(number);
        while (temp > 0) {
            reversed = reversed * 10 + temp % 10;
            temp /= 10;
        }

        if (number < 0) {
            reversed = -reversed;
        }

    
        System.out.println("Reversed number: " + reversed);

        scanner.close();
    }
}
