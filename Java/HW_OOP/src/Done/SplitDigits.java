package Done;

import java.util.Scanner;

public class SplitDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbers1 = scanner.nextLine();
        String numbers = numbers1.trim();
        if (numbers.length()>5){
            System.out.println("Number is too long!");
        }
        else if(numbers.length()<5){
            System.out.println("Number is too short!");
        }
        else{
            splitdigits(numbers);
        }

    }
    private static void splitdigits(String numbers){
        int i=0;
        while(i<5) {
            System.out.println(numbers.charAt(i));
            i++;
        }

    }
}
