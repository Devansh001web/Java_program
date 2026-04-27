import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        
        double area = length * width;

        
        System.out.println("Area of the rectangle is: " + area);

        scanner.close();
    }
}
