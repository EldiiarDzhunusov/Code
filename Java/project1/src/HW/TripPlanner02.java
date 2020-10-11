package HW;

import java.util.Scanner;

public class TripPlanner02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int timeDiff = timeDifference(scanner);
        answer(timeDiff);

    }
    public static int timeDifference(Scanner scanner){
        System.out.println("What is the time difference, in hours, between your home and your destination? ");
        return scanner.nextInt();
    }
    public static void answer(int timeDiff){
        int timeMid;
        int timeNoon;
        if (timeDiff>=0) {
            timeMid = Math.abs(0 + timeDiff) % 24;
            timeNoon = Math.abs(12 + timeDiff) % 24;
        }
        else{
            timeMid = 24-  Math.abs(0 + timeDiff) % 24;
            timeNoon = Math.abs(12 + timeDiff) % 24;
        }
        System.out.println("That means that when it is midnight at home it will be "+timeMid
                +":00 in your travel destination and when it's noon at home it will be "+timeNoon+":00");
        System.out.println("***********");
    }
}
