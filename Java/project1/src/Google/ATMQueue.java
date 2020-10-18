package Google;

import java.util.Arrays;
import java.util.Scanner;

public class ATMQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int caseNumber=1;
        while(t>0){
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int[] arr= new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            System.out.printf("Case #%d:",caseNumber);
            solution(n,x,arr);
            System.out.println();
            caseNumber++;
            t--;
        }
    }
    public static void solution(int n, int x, int[] arr){
        int[] ans = new int[n];
        int i = 0;
        while(i<n){
            for (int j = 0; j < n; j++) {
                if(arr[j]>0){
                    if (arr[j] - x > 0) {
                        arr[j] -= x;
                    } else {
                        arr[j] -= x;
                        ans[i] = j + 1;
                        i++;
                    }
                }

            }
        }
        for (int j = 0; j < ans.length; j++) {
            System.out.print(" "+ans[j]);
        }
        
    }
}
