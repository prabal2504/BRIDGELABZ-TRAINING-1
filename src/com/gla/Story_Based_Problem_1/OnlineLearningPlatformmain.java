class Course {
    protected int courseId;
    protected String courseName;
    protected double price;
    protected static String platformName = "LearnX";

    public Course(int courseId, String courseName, double price) {
        this.courseId = courseId;
        this.courseName = toTitleCase(courseName);
        this.price = price;
    }
    public String toTitleCase(String str) {
        String[] words = str.split(" ");
        String result = "";

        for (String word : words) {
            result += word.substring(0,1).toUpperCase() +
                    word.substring(1).toLowerCase() + " ";
        }
        return result.trim();
    }

    public double getFinalPrice() {
        return price;
    }

    public void display() {
        System.out.println(courseId + " | " + courseName + " | " +
                getFinalPrice() + " | " + platformName);
    }
}
class RecordedCourse extends Course {

    public RecordedCourse(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double getFinalPrice() {
        return price * 0.90;
    }
}
class LiveCourse extends Course {

    public LiveCourse(int id, String name, double price) {
        super(id, name, price);
    }
    @Override
    public double getFinalPrice() {
        return price * 0.95;
    }
}
public class Main {
    public static void main(String[] args) {

        Course c1 = new RecordedCourse(101, "java programming", 1000);
        Course c2 = new LiveCourse(102, "data structures", 2000);
        c1.display();
        c2.display();
    }
}