package Done;

import java.util.Scanner;

public class ReverseTriangleOfNumbers {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter N: ");
            int n = scanner.nextInt();
            int empty = 0;
            int copy = n ;
            for (int i = 0; i < copy; i++) {
                for (int j = 0; j < empty; j++) {
                    System.out.printf("  ");
                }
                for (int j = 1; j <= n; j++) {
                    System.out.printf("%d ",j);
                }
                System.out.println();
                n--;
                empty++;
            }
        } catch (Exception e){
            System.out.println("Incorrect input");
        }


    }
}
