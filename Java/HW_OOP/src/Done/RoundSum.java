package Done;

import java.util.Scanner;

public class RoundSum {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three integers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println("Rounded sum is "+roundSum(a,b,c));

    }

    private static int roundSum(int a, int b, int c) {
        a= round(a+b+c);
        return a;
    }
    private static int round(int num){
        if(num%10>=5){
            num+=10-num%10;
        }
        else{
            num-=num%10;
        }
        return num;
    }
}
