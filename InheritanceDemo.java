class Person {
    String name;
    void display() {
        System.out.println("Name: " + name);
    }
}

class Employee extends Person {
    int salary;
    void show() {
        System.out.println("Salary: " + salary);
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "Devansh";
        e.salary = 50000;
        e.display();
        e.show();
    }
}
