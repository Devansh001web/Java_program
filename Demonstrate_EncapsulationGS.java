
class Student {
    
    private int rollNo;
    private String name;
    private double marks;

   
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

   
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    
    public double getMarks() {
        return marks;
    }
    public void setMarks(double marks) {
        this.marks = marks;
    }
}


public class Demonstrate_EncapsulationGS {
    public static void main(String[] args) {
        
        Student s1 = new Student();

        
        s1.setRollNo(101);
        s1.setName("Devansh");
        s1.setMarks(99.5);

        
        System.out.println("Student Details:");
        System.out.println("Roll No: " + s1.getRollNo());
        System.out.println("Name: " + s1.getName());
        System.out.println("Marks: " + s1.getMarks());
    }
}
