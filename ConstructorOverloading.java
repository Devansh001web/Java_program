class Rectangle {
    int length, width;

    Rectangle() { // default constructor
        length = 0;
        width = 0;
    }

    Rectangle(int l, int w) { // parameterized constructor
        length = l;
        width = w;
    }

    int area() {
        return length * width;
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(10, 5);
        System.out.println("Area r1 = " + r1.area());
        System.out.println("Area r2 = " + r2.area());
    }
}
