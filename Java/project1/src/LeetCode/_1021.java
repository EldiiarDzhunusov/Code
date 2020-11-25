package LeetCode;

import java.util.Arrays;

public class _1021 {
    public static void main(String[] args) {
        String S = "(()())(())";
        String[] arr = S.split("");
        int counter = 0;
        int index=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].compareTo("(")==0){
                if(counter==0){
                    index=i;
                }
                counter++;
            }
            else if(arr[i].compareTo(")")==0){
                counter--;
            }
            if(counter==0){
                arr[index]=" ";
                arr[i]=" ";
            }
        }
        String ans = "";
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].compareTo(" ")!=0){
                ans+=arr[i];
            }
        }
        System.out.println(ans);
    }
}
