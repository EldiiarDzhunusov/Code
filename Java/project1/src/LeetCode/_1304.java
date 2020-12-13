package LeetCode;

import java.util.Arrays;

public class _1304 {
    public static void main(String[] args) {
        int n =3;

        int[] arr = new int[n];
        int min = (n/2)*(-1);
        int max = n/2;
        int i=0;
        int j=n-1;
        while(i<=j){
            arr[i++]=min++;
            arr[j--]=max--;
        }

        System.out.println(Arrays.toString(arr));
    }
}
