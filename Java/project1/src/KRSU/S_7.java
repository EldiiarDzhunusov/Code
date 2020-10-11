package KRSU;

import java.util.Scanner;

public class S_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        long ans= ((n-1)+((m-1)*n));
        System.out.println(ans);
    }
}
