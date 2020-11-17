package temp;

import java.util.Arrays;

public class merge {
    public static void main(String[] args) {
        String word = "hello";
        int[] arr = {3,2,1};
        int[] arr1 = mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr1));

    }
    public static int[] mergeSort(int[] arr,int r, int l){
        if(r<l){
            int m = (l+r)/2;
            int[] arr1 = mergeSort(arr,l,m);
            int[] arr2 = mergeSort(arr,m+1,l);

            int ans[] = merge(arr1,arr2);
            return ans;
        }
        return arr;

    }
    public static int[] merge(int[] arr1, int[] arr2){
        int size = arr1.length+arr2.length;
        int[] arr = new int[size];
        int a1 = 0;
        int a2 = 0;
        int a = 0;
        while(a1<=arr1.length-1 && a2<=arr2.length-1){
            if(arr1[a1]<=arr2[a2]){
                arr[a] = arr1[a1];
                a1++;
            }
            else{
                arr[a] = arr2[a2];
                a2++;
            }
            a++;
        }
        while(a1<=arr1.length-1){
            arr[a] = arr1[a1];
            a1++;
            a++;
        }
        while(a2<=arr2.length-1){
            arr[a] = arr2[a2];
            a2++;
            a++;
        }
        return arr;

    }
}
