class Student {
    protected int rollNo;
    protected String name;
    protected double marks;

    public Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public String calculateGrade() {
        if (marks >= 80) return "A";
        else if (marks >= 60) return "B";
        else return "C";
    }
}
class EngineeringStudent extends Student {
    private String branch;

    public EngineeringStudent(int rollNo, String name, double marks, String branch) {
        super(rollNo, name, marks);
        this.branch = branch;
    }

    public String getDetails() {
        return name + " (" + branch + ")";
    }
}
public class Main {
    public static void main(String[] args) {
        EngineeringStudent s = new EngineeringStudent(1, "Prabal", 85, "CSE");

        System.out.println("Student: " + s.getDetails());
        System.out.println("Grade: " + s.calculateGrade());
    }
}