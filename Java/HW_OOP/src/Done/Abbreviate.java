package Done;

import java.util.Scanner;

public class Abbreviate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt()+1;
        while (t>0) {
            String word = scanner.nextLine();
            System.out.println(abbreviate(word));

            t--;
        }
    }

    private static String abbreviate(String word) {
        if(word.length()>10){
            word = word.substring(0,1)+Integer.toString(word.length()-2)+word.substring(word.length()-1,word.length());
        }
        return word;
    }
}