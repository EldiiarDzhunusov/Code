package Google;

import java.util.Arrays;
import java.util.Scanner;

public class Template {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int caseNumber = 1;
        while (t > 0) {
            //input
            System.out.printf("Case #%d:", caseNumber);
            solution();
            System.out.println();
            caseNumber++;
            t--;
        }
    }

    public static void solution() {

    }
}
