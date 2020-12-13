package Done;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(">>>");
        int angle1 = scanner.nextInt();
        int angle2 = scanner.nextInt();
        int angle3 = scanner.nextInt();
        int ans = angle1+angle2+angle3;
        if(ans == 180 && angle1>0 && angle2>0 && angle3>0){
            System.out.println("It is a valid triangle.");
        }
        else{
            System.out.println("It is not a valid triangle.");
        }
    }
}
