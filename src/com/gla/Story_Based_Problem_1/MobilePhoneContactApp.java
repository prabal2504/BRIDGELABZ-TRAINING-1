class Contact {
    protected String name;
    protected String phoneNumber;
    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public void display() {
        System.out.println("Name: " + name + ", Phone: " + phoneNumber);
    }
}
class BusinessContact extends Contact {
    private String companyName;
    public BusinessContact(String name, String phoneNumber, String companyName) {
        super(name, phoneNumber);
        this.companyName = companyName;
    }

    @Override
    public void display() {
        System.out.println("Name: " + name.toUpperCase() +
                ", Phone: " + phoneNumber +
                ", Company: " + companyName);
    }
}
public class Main {
    public static void main(String[] args) {
        Contact c1 = new Contact("Shivam ", "9876543210");
        Contact c2 = new BusinessContact("Devansh", "9123456780", "TCS");

        c1.display();
        c2.display();
    }
}