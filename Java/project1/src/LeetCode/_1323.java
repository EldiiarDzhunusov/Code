package LeetCode;

import java.util.Arrays;

public class _1323 {
    public static void main(String[] args) {
        int num = 9669;

        String[] numS= Integer.toString(num).split("");

        for (int i = 0; i < numS.length; i++) {
            if(numS[i].compareTo("6")==0){
                numS[i]="9";
                break;
            }
        }
        String ans1 ="";
        for (int i = 0; i < numS.length; i++) {
            ans1+=numS[i];
        }
        int ans = Integer.parseInt(ans1);
        System.out.println(ans);
    }
}
