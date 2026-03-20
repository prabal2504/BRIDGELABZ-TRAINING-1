import java.util.Scanner;

class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double weight = sc.nextDouble();    // kg
        double heightCm = sc.nextDouble();  // cm

        double heightM = heightCm / 100;
        double bmi = weight / (heightM * heightM);

        if (bmi <= 18.4)
            System.out.println("Underweight");
        else if (bmi <= 24.9)
            System.out.println("Normal");
        else if (bmi <= 39.9)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }
}
