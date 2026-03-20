package javaArrays.level1;
import java.util.*;
public class InputUntillZero {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;
        while (true) {
            double value = sc.nextDouble();
            if (value <= 0 || index == 10) {
                break;
            }
            numbers[index] = value;
            index++;
        }
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }
        System.out.println(total);
        sc.close();
    }
}
