package Other;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class WC08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextInt();
        }

        for (int i = 0; i < q; i++) {
            int i1 = scanner.nextInt();
            int r1 = scanner.nextInt();
            int c = scanner.nextInt();
            int[] arr = new int[(r1-i1)+1];
            int index =0;
            for (int i2 = i1-1; i2 < r1; i2++) {
                arr[index++] = arr1[i2];
            }

            sort(arr, 0, arr.length - 1);

            sol(arr,c);

        }
    }
    public static void sol(int[] arr, int c){
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j]==c){
                    ans++;
                }
                if(arr[j]>c){
                    break;
                }
            }
            if(arr[i]>c){
                break;
            }
        }
        System.out.println(ans);
    }
    public static void merge(int arr[], int l, int m, int r)
    {

        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

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
