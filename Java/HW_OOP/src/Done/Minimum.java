package Done;

import java.util.Scanner;

public class Minimum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(">>>");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int ans = Math.min(a,Math.min(b,c));
        if (a==b && a==c && b==c) {
            System.out.println("They are all equal");
        }
        else{
            System.out.println("The least of these three numbers is " + ans);
        }
    }
}
