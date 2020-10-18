package HW;

import java.util.Scanner;

public class BalancedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {


            int[] numbers = new int[10];
            for (int i = 0; i < 10; i++) {
                numbers[i] = scanner.nextInt();
            }
            int sum1 = 0, sum2 = 0, i = 0, j = 9;
            while (i <= j) {
                if (sum1 <= sum2) {
                    sum1 += numbers[i];
                    i++;
                } else {
                    sum2 += numbers[j];
                    j--;
                }

            }

            if (sum1 == sum2) {
                System.out.println("Can be balanced");
            } else {
                System.out.println("Can not be balanced");
            }
        }
        catch (Exception e){
            System.out.println("Error");
        }



    }
}
