package Google;
//not complete
import java.util.Scanner;

public class ParentingPartneringReturns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int caseNumber = 1;
        while (t > 0) {
            int n = scanner.nextInt();
            int[][] arr = new int[n][2];

            for (int i = 0; i < n; i++) {
                for (int i1 = 0; i1 < 2; i1++) {
                    arr[i][i1]= scanner.nextInt();
                }
            }
            System.out.printf("Case #%d:", caseNumber);
            solution(arr, n);
            System.out.println();
            caseNumber++;
            t--;
        }
    }

    public static void solution(int[][] arr, int n) {
        //solution
    }
}
