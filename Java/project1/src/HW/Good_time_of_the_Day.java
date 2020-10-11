package HW;

import java.util.Scanner;

public class Good_time_of_the_Day {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(">>>");
        int time = scanner.nextInt();
        if (time<0 || time>24){
            System.out.println("Not acceptable time.");
        }
        else{
            if (time<=5){
                System.out.println("Good night!");
            }
            else if(time<10){
                System.out.println("Good morning!");
            }
            else if(time<20){
                System.out.println("Good day!");
            }
            else{
                System.out.println("Good evening!");
            }
        }

    }
}
