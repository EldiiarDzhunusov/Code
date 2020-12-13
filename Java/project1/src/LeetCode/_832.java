package LeetCode;

import java.util.Arrays;

public class _832 {
    public static void main(String[] args) {
        int[][] A = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        int temp=0;
        for (int i = 0; i < A.length; i++) {
            int start =0;
            int size = A[i].length-1;
            while(start<=size){
                temp=A[i][start];
                A[i][start]=A[i][size];
                A[i][size]=temp;
                if(size==start){
                    if(A[i][size]==0){
                        A[i][size]=1;
                    }
                    else{
                        A[i][size]=0;
                    }
                }
                else{
                    if(A[i][size]==0){
                        A[i][size]=1;
                    }
                    else{
                        A[i][size]=0;
                    }
                    if(A[i][start]==0){
                        A[i][start]=1;
                    }
                    else{
                        A[i][start]=0;
                    }
                }

                size--;
                start++;

            }
        }
        for (int i = 0; i < A.length; i++) {
            System.out.println(Arrays.toString(A[i]));
        }
    }
}
