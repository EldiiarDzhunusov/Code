package Google;

import java.util.Scanner;

public class MaximumCoins_7pts_8pts_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int caseNumber = 1;
        while (t > 0) {
            int size = scanner.nextInt();
            int[][] arr = new int[size][size];
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    arr[i][j] = scanner.nextInt();
                }
            }
            System.out.printf("Case #%d: %d\n", caseNumber, solution(arr, size));
            caseNumber++;
            t--;
        }
    }

    public static int solution(int[][] arr, int size) {
        int ans = 0;
        for (int i = 0; i < size; i++) {
            int down = 0;
            int right = i;
            int localMax = 0;
            while(down<size && right<size){
                localMax += arr[down][right];
                right++;
                down++;
            }
            if(localMax>ans){
                ans = localMax;
            }
        }
        for (int i = 0; i < size; i++) {
            int localMax = 0;
            int down = i;
            int right = 0;
            while(down<size && right<size){
                localMax += arr[down][right];
                right++;
                down++;
            }
            if(localMax>ans){
                ans = localMax;
            }
        }
    return ans;
    }
}
