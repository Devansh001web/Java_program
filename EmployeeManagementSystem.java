
abstract class Employee {
    protected String name;
    protected int id;

    
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    
    public abstract double calculateSalary();

    
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + calculateSalary());
        System.out.println("-----------------------------");
    }
}


class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    
    public double calculateSalary() {
        return monthlySalary;
    }
}


class PartTimeEmployee extends Employee {
    private double ratePerHour;
    private int hoursWorked;

    public PartTimeEmployee(String name, int id, double ratePerHour, int hoursWorked) {
        super(name, id);
        this.ratePerHour = ratePerHour;
        this.hoursWorked = hoursWorked;
    }

    
    public double calculateSalary() {
        return ratePerHour * hoursWorked;
    }
}


public class EmployeeManagementSystem  {
    public static void main(String[] args) {
        FullTimeEmployee fte = new FullTimeEmployee("Alice", 101, 50000);
        PartTimeEmployee pte = new PartTimeEmployee("Bob", 102, 500, 40);

        fte.displayDetails();
        pte.displayDetails();
    }
}
