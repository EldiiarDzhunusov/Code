package Algorithms;


import java.util.Arrays;
import java.util.Scanner;

public class QuickFindUF {
    private static int[] arr;
    private static int n;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        union(2,3);
        union(1,2);
        union(3,4);
        System.out.println(connected(1,2));
        System.out.println(connected(4,5));
        union(4,5);
        System.out.println(connected(4,5));
        System.out.println(Arrays.toString(arr));
    }

    public static void union(int a ,int b) {
        int p = arr[a];
        int q = arr[b];
        for (int i = 0; i < b; i++) {
            if(arr[i]==p){
                arr[i]=q;
            }
        }
    }
    public static boolean connected(int a, int b){
        return arr[a]==arr[b];
    }
}
