package CodeForces;

import java.util.Scanner;

public class BoringRooms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t != 0) {
            String number = scanner.nextLine();
            solution(number);
            t--;
        }
    }

    public static void solution(String number) {
        int len = number.length();
        int first = Character.getNumericValue(number.charAt(0));
        int ans = (first -1)*10;
        for (int i = 1; i <= len; i++) {
            ans+= i;
        }
        System.out.println(ans);
        //solution
    }
}
