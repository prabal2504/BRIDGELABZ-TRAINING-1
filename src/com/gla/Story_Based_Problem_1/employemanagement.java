class Employee {
    protected int empId;
    protected String name;
    public Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    public String generateEmail() {
        return name.toLowerCase() + "@company.com";
    }
}
class Manager extends Employee {
    private String department;

    public Manager(int empId, String name, String department) {
        super(empId, name);
        this.department = department;
    }

    @Override
    public String generateEmail() {
        return name.toLowerCase() + "." +
                department.toLowerCase() + "@company.com";
    }
}
public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Rahul");
        Employee e2 = new Manager(102, "Amit", "HR");

        System.out.println("Employee Email: " + e1.generateEmail());
        System.out.println("Manager Email: " + e2.generateEmail());
    }
}