package Done;

import java.util.Scanner;

public class Odd_or_Even {
    public static void main(String[] args) {
        System.out.println(">>>");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number==0){
            System.out.println("0 is not odd nor even");
        }

        else if (number%2==0){
            System.out.println("This number is even ");
        }
        else{
            System.out.println("This number is odd  ");
        }
    }
}
