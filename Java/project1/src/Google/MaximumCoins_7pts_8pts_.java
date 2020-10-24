package Google;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MaximumCoins_7pts_8pts_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int caseNumber = 1;
        while (t > 0) {
            int size = scanner.nextInt();
            long[][] arr = new long[size][size];
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
    public static long solution(long[][] arr, int size) {
        long ans = 0;
        for (int i = 0; i < size; i++) {
            long local = 0;
            int right = i;
            int down = 0;
            while(right<size){
                local+= arr[down][right];
                down++;
                right++;
            }
            if(local>ans){
                ans=local;
            }
        }
        for (int i = 0; i < size; i++) {
            long local = 0;
            int right = 0;
            int down = i;
            while(down<size){
                local+= arr[down][right];
                down++;
                right++;
            }
            if(local>ans){
                ans=local;
            }
        }


        return ans;
    }


}
