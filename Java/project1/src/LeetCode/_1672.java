package LeetCode;

import java.util.Arrays;


public class _1672 {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};

        int size = accounts.length;
        int[] arr= new int[size];
        int max =0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < accounts[0].length; j++) {
                arr[i]+=accounts[i][j];
            }
            if (arr[i]>max){
                max = arr[i];
            }
        }


        //return max;
    }

}
