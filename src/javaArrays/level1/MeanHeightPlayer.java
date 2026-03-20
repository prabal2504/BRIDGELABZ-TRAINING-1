package javaArrays.level1;
import java.util.*;
public class MeanHeightPlayer {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double[] heights = new double[11];
        int sum = 0;
        for (int i = 0; i < heights.length; i++) {
            heights[i] = sc.nextDouble();
        }
        for(int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }
        double mean = sum/11;
        System.out.println(mean);
    }
}
