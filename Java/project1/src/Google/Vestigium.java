package Google;

import java.util.Scanner;

public class Vestigium {
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
            System.out.printf("Case #%d:", caseNumber);
            solution(arr, size);

            caseNumber++;
            t--;
        }
    }

    public static void solution(int[][] arr, int size) {
        //check for k
        int k = 0;
        for (int i = 0; i < size; i++) {
            k+=arr[i][i];
        }


        int r =0;
        int c = 0;
        for (int i = 0; i < size; i++) {
            int temp1=0;
            int temp2 = 0;
            for (int j = 0; j < size; j++) {
                for (int q = 0; q < size; q++) {
                    if(arr[i][j]==arr[i][q] && j!=q){
                        temp2++;
                    }
                    if(arr[j][i] == arr[q][i] && j!=q){
                        temp1++;
                    }

                }
            }
            if(temp1>0){
                c++;
            }
            if(temp2>0){
                r++;
            }


        }
        System.out.printf(" %d %d %d\n",k,r,c);

    }
}
