package Other;

import java.util.ArrayList;
import java.util.Scanner;

public class WC01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int arr[][]=new int[t][2];
        for (int i = 0; i < t; i++) {
            arr[i][0]=scanner.nextInt();
        }
        for (int i = 0; i < t; i++) {
            arr[i][1]=scanner.nextInt();
        }
        sol(arr,t);


    }
    public static void sol(int[][] arr, int size){
        int ending = 0;
        int index =0;
        ArrayList<Integer> ans= new ArrayList<>();
        ans.add(0);
        while(index++<size-1){
            if(arr[index][0]>=arr[ending][1]){
                ans.add(index);
                ending = index;
            }
        }
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i)+" ");
        }
    }

}