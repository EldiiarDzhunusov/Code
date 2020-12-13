import java.util.Scanner;

public class Hello_or_Bye {
    public static void main(String[] args) {
        String word1 = "HELLO WORLD!";
        String word2 = "hello world!";
        System.out.println(">>>");
        Scanner scanner = new Scanner(System.in);
        String letter = scanner.next();
        int check1 = word1.indexOf(letter);
        int check2 = word2.indexOf(letter);
        if(check1>=0 || check2 >=0){
            System.out.println("hello");
        }
        else{
            System.out.println("bye");
        }
    }
}
