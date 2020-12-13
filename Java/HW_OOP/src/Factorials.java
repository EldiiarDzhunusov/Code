import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int number = scanner.nextInt();
        System.out.println("X    X!");
        if(number<0){
            System.out.println("Incorrect input!");
        }
        else{
            for (int i = 0; i <= number; i++) {
                System.out.println(i+"    "+factorialOfN(i));
            }
        }


    }

    private static long factorialOfN(int n) {
        if (n==0){
            return 1;
        }
        else if(n==1){
            return 1;
        }
        else{
            return n* factorialOfN(n-1);
        }
    }
}
