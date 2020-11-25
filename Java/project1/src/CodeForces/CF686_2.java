package CodeForces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CF686_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t--!=0){
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            int[] arr2 = new int[n];
            for (int i = 0; i < arr2.length; i++) {
                arr2[i]=arr[i];
            }
            int ans = solution(arr, n);
            if (ans==-1){
                System.out.println(-1);
            }
            else{
                for (int i = 0; i < arr.length; i++) {
                    if(arr2[i]==ans){
                        ans = i+1;
                        break;
                    }
                }
                System.out.println(ans);
            }



        }
    }
    public static int solution(int[] arr, int n){
        sort(arr, 0, arr.length - 1);
        int temp=-1;
        if(n==1){
            return arr[0];
        }
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]!=arr[i+1] && arr[i]!=temp){
                return arr[i];
            }
            else{
                temp=arr[i];
            }
        }
        if(arr[arr.length-1]!=arr[arr.length-2] && arr[arr.length-1]!=temp){
            return arr[arr.length-1];
        }
        return -1;
    }





    public static void merge(int arr[], int l, int m, int r)
    {

        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void sort(int arr[], int l, int r)
    {
        if (l < r) {

            int m = (l + r) / 2;

            sort(arr, l, m);
            sort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }






}
