package Done;

import java.util.Scanner;

public class LettersSpacesNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int letter = 0;
        int space = 0;
        int number = 0;
        int other = 0;
        for (int i = 0; i < word.length(); i++) {
            if((int)word.charAt(i)==32){
                space++;
            }
            else if(((int)word.charAt(i)>=65 && (int)word.charAt(i)<=90) || ((int)word.charAt(i)>=97 && (int)word.charAt(i)<=122)){
                letter++;
            }
            else if((int)word.charAt(i)>=48 && (int)word.charAt(i)<=57){
                number++;
            }
            else{
                other++;
            }
        }
        System.out.println("letter: "+letter);
        System.out.println("space: "+space);
        System.out.println("number: "+number);
        System.out.println("other: "+other);

    }
}
