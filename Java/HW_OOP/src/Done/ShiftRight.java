package Done;

import java.util.ArrayList;
import java.util.Scanner;

public class ShiftRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter your numbers, press return to end.");
        String word = scanner.nextLine();
        while(word.compareTo("")!=0){
            try{
                numbers.add(Integer.parseInt(word));
                word = scanner.nextLine();
            }
            catch (Exception e){
                System.out.println("Not a legal number. Try again!");
                word = scanner.nextLine();
            }
        }
        System.out.println("Enter N:");
        int shift = scanner.nextInt();
        if(numbers.size()>0){
            shift = shift% numbers.size();
        }

        for (int i = 0; i < numbers.size(); i++) {

            System.out.print(numbers.get(((i-shift)+numbers.size())%numbers.size())+ " ");

        }

    }
}
