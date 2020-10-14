package CodeForces;

import java.util.Scanner;

public class edu1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t= scanner.nextInt();
        while(t!=0) {
            int x3 = 0, x5 = 0, x7 = 0;
            int rooms = scanner.nextInt();
            if (rooms == 1 || rooms == 2 || rooms == 4) {
                System.out.println(-1);
            } else if (rooms % 7 == 0) {
                System.out.println("0 0 " + rooms / 7);
            } else if (rooms % 5 == 0) {
                System.out.println("0 " + rooms / 5 + " 0");
            } else if (rooms % 3 == 0) {
                System.out.println(rooms / 3 + " 0 0");
            } else {
                int x = rooms / 3;
                x--;
                if (rooms % 3 == 1) {
                    System.out.println(x-1 + " 0 1");
                } else {
                    System.out.println(x + " 1 0");

                }
            }
            t--;
        }
    }

}
