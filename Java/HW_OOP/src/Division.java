import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a dividend: ");
        int dividend = scanner.nextInt();
        System.out.printf("Enter a Enter a divisor: ");
        int divisor = scanner.nextInt();
        if ( divisor!= 0){
            System.out.println("Quotient is : "+dividend/divisor);
        }
        else{
            System.out.println("Incorrect input!");
        }
    }
}
