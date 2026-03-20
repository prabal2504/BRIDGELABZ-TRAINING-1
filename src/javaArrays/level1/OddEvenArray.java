package javaArrays.level1;
import java.util.*;
public class OddEvenArray {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number<0){
            System.out.println("Invalid input");
            return;
        }
        int[] even = new int[number/2+1];
        int[] odd = new int[number/2+1];

        int evenidx = 0;
        int oddidx = 0;

        for (int i=0;i<=number;i++){
            if(i%2==0){
                even[evenidx]=i;
                evenidx++;
            }
            else{
                odd[oddidx]=i;
                oddidx++;
            }
        }
        for (int i=0;i<oddidx;i++){
            System.out.print(odd[i]+" ");
        }
        System.out.println();
        for (int i=0;i<evenidx;i++){
            System.out.print(even[i]+" ");
        }
    }
}
