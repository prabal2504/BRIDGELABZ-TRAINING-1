import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. Input marks
        System.out.print("Enter Physics marks: ");
        int phy = sc.nextInt();

        System.out.print("Enter Chemistry marks: ");
        int chem = sc.nextInt();

        System.out.print("Enter Maths marks: ");
        int math = sc.nextInt();

        // 2. Calculate total and percentage
        int total = phy + chem + math;
        double percentage = total / 3.0;

        // 3. Find grade and remarks
        char grade;
        String remarks;

        if (percentage >= 80) {
            grade = 'A';
            remarks = "Level 4, above agency-normalized standards";
        } else if (percentage >= 70) {
            grade = 'B';
            remarks = "Level 3, at agency-normalized standards";
        } else if (percentage >= 60) {
            grade = 'C';
            remarks = "Level 2, below but approaching agency-normalized standards";
        } else if (percentage >= 50) {
            grade = 'D';
            remarks = "Level 1, well below agency-normalized standards";
        } else if (percentage >= 40) {
            grade = 'E';
            remarks = "Level 1-, too below agency-normalized standards";
        } else {
            grade = 'R';
            remarks = "Remedial standards";
        }

        // 4. Output
        System.out.println("Total Marks = " + total);
        System.out.println("Average (Percentage) = " + percentage + " %");
        System.out.println("Grade = " + grade);
        System.out.println("Remarks = " + remarks);

        sc.close();
    }
}	