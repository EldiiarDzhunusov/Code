package HW;

import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter N: ");
            int t = scanner.nextInt();
            double[] nums = new double[t];

            for (int i = 0; i < t; i++) {
                nums[i] = scanner.nextDouble();
            }
            Arrays.sort(nums);

            for (int i = 0; i < t; i++) {
                if(nums[i]!=nums[0]){
                    System.out.println(nums[i]);
                    break;
                }
            }
        }
        catch (Exception e){
            System.out.println("error");
        }



    }
}
