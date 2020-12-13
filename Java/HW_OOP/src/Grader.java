import java.util.Scanner;

public class Grader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(">>> ");
        int number = scanner.nextInt();
        if ( number>=50 && number <=100){
            System.out.println("passed");
        }
        else if(number>=0&& number<50){
            System.out.println("failed");
        }
        else
            System.out.println("Incorrect grade!");
    }
}
