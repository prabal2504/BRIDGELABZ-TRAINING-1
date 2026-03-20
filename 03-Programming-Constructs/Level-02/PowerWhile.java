import java.util.Scanner;

public class PowerWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        System.out.print("Enter the power: ");
        int power = sc.nextInt();

        if (number <= 0 || power < 0) {
            System.out.println("Please enter valid positive values.");
        } else {
            int result = 1;     // initial value
            int counter = 0;    // temp variable

            while (counter < power) {
                result = result * number;
                counter++;
            }

            System.out.println(number + " raised to the power " + power + " is: " + result);
        }
    }
} 
