import java.util.Scanner;

public class PerimeterSquare {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side of the square: ");
        double side = scanner.nextDouble();

       
        double perimeter = 4 * side;

       
        System.out.println("Perimeter of the square is: " + perimeter);

        scanner.close();
    }
}
