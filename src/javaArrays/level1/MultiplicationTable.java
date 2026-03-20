package javaArrays.level1;
import java.util.*;
public class MultiplicationTable {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int[] table = new int[10];
        for(int i=1;i <= 10;i++){
            table [i-1] = number * i;
        }
        for (int i=1;i<=10;i++){
            System.out.print(table[i-1]+",");
        }
    }
}
