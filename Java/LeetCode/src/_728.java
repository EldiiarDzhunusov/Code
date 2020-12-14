import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _728 {
    public static void main(String[] args) {
        int left =1 ;
        int right =22;
        ArrayList<Integer> ans = solution(left,right);
        System.out.println(ans);
    }
    public static ArrayList<Integer> solution(int left, int right){
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = left; i <=right ; i++) {
            String[] word = Integer.toString(i).split("");
            boolean checker = true;
            for (int j = 0; j < word.length; j++) {
                if(word[j].compareTo("0")==0 || (i%Integer.parseInt(word[j])!=0)){
                    checker = false;
                }
            }
            if(checker){
                ans.add(i);
            }

        }

        return ans;
    }


}
