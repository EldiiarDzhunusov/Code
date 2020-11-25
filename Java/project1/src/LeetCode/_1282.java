package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class _1282 {
    public static void main(String[] args) {
        int[] groupSizes = {3,3,3,3,3,1,3};
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for (int i = 0; i < groupSizes.length; i++) {
            int size = groupSizes[i];
            int delete = groupSizes[i];
            for (int j = i; j < groupSizes.length; j++) {
                if(delete==0){
                    break;
                }
                if(size==groupSizes[j]){
                    groupSizes[i]=0;
                    delete--;
                }
            }


        }
    }
}
