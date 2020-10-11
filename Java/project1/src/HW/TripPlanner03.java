package HW;

import java.util.Scanner;

public class TripPlanner03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is square area of your destination country in km2? ");
        double number = scanner.nextDouble();
        answer(number);

    }
    public static void answer(double number){
        double newNumber = ((int)(number * (0.38610215854245)*100))/100.0;
        System.out.println("In miles2 that is "+newNumber);
        System.out.println("***********");
    }
}
