package HW;

import java.util.Scanner;

public class TripPlanner {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int days = days(scanner);
        double budget = budget(scanner);
        String currency = currency(scanner);
        double rate = rate(currency,scanner);
        answer(days,budget,currency,rate);
    }

    public static int days(Scanner scanner){
        System.out.println("How many days are you going to spend traveling? ");
        return scanner.nextInt();
    }

    public static double budget(Scanner scanner){
        System.out.println("How much money, in USD, are you planning to spend on your trip: ");
        return scanner.nextDouble();
    }

    public static String currency(Scanner scanner){
        System.out.println("What is the three letter currency symbol for your travel destination? ");
        return scanner.next();
    }

    public static double rate(String currency, Scanner scanner){
        System.out.println("How many "+currency+" are there in 1 USD? ");
        return scanner.nextDouble();
    }

    public static void answer(int days, double budget, String currency, double rate){
        int hours = days * 24;
        int minus = hours * 60;
        int seconds = minus * 60;
        System.out.println("");
        System.out.println("If you are traveling for "+days+" days that is same as "+hours+" hours or "+ minus + " minutes or "+seconds+" seconds.");
        double perDay = ((int)((budget/days)*100))/100.0;
        System.out.println("If you are going to spend $"+(int)budget+" USD that means per day you can spend up to $"+perDay+" USD");
        double perDayCurrency = ((int)(((budget*rate)/days)*100))/100.0;
        System.out.println("Your total budget in "+currency+" is "+budget*rate+" "+currency+", which per day is "+perDayCurrency+" "+currency);
        System.out.println("***********");


    }

}
