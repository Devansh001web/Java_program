
abstract class Bike {
    abstract void run(); 

    void start() {      
        System.out.println("Bike is starting...");
    }
}


class Honda extends Bike {
    void run() {
        System.out.println("Bike is running...");
    }
}


abstract class Car {

    void start() {
        System.out.println("Car is starting...");
    }
}


class BMW extends Car {
    void drive() {
        System.out.println("Car is driving...");
    }
}


public class Abstraction {
    public static void main(String[] args) {
        
        
        Honda bike = new Honda();
        bike.start();
        bike.run();

        System.out.println("------------------");

        
        BMW car = new BMW();
        car.start();
        car.drive();
    }
}