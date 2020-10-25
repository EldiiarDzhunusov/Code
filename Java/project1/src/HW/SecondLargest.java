package HW;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {
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
            double second=0;
            for (int i = 0; i < t; i++) {
                if(nums[i]!=nums[t-1]){
                    second = nums[i];
                }
            }
            System.out.println(second);
        }
        catch (Exception e){
            System.out.println("error");
        }



    }
}
