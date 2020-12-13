import java.util.Arrays;
import java.util.Scanner;

public class Capitalization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String test1 = scanner.nextLine();
        test1 = test1.trim();
        String[] words = test1.split(" ");

        for (int i = 0; i < words.length; i++) {
            if(words[i].length()>1){
                words[i]= words[i].substring(0,1).toUpperCase()+words[i].substring(1);
            }
            else{
                words[i]= words[i].substring(0,1).toUpperCase();
            }

        }
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i]);
            System.out.print(" ");
        }
        System.out.println();
    }
}
