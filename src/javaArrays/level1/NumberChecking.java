package javaArrays.level1;
import java.util.*;
public class NumberChecking {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int[] number = new int[5];
        for(int i = 0;i < number.length; i++){
            number[i] = sc.nextInt();
        }
        for (int i=0;i < number.length;i++){
            if(number[i]>0){
                System.out.println("Positive: "+number[i]);
            } else if (number[i]<0) {
                System.out.println("Negative: "+number[i]);
            }
            else{
                System.out.println("Number is zero");
            }
        }
    }
}
