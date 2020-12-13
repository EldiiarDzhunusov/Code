package Done;

import java.util.Arrays;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        word = word.trim();
        String words[]= word.split(" ");
        String a1 = words[0];
        String a2 = words[2];
        int a = Integer.parseInt(a1);
        int b = Integer.parseInt(a2);


        switch (words[1]){
            case "+":
                System.out.println(addition(a,b));
                break;
            case "-":
                System.out.println(subtraction(a,b));
                break;
            case "*":
                System.out.println(multiplication(a,b));

                break;
            case "/":
                if(b!=0){
                    System.out.println(division(a,b));
                }
                else{
                    System.out.println("Error");
                }

                break;
            default:
                System.out.println(a%b);
        }
        // add your code here
    }

    private static int addition(int number1, int number2) {
        return number1 + number2;
    }

    private static int subtraction(int number1, int number2) {
        return number1 - number2;
    }

    private static int multiplication(int number1, int number2) {
        return number1 * number2;
    }

    private static int division(int dividend, int divisor) {
        return dividend/divisor;
    }
}
