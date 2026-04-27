class MathOps {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        MathOps m = new MathOps();
        System.out.println("Sum (int) = " + m.add(5, 10));
        System.out.println("Sum (double) = " + m.add(5.5, 10.5));
    }
}
