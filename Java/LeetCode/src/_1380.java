import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _1380 {
    public static void main(String[] args) {
        System.out.println(luckyNumbers(new int[][]{{3,7,8},{9,11,13},{15,16,17}}));
        System.out.println(luckyNumbers(new int[][]{{1,10,4,2},{9,3,8,7},{15,16,17,12}}));
        System.out.println(luckyNumbers(new int[][]{{7,8},{1,2}}));
    }
    public static List<Integer> luckyNumbers (int[][] matrix) {
        int[] maxArray = new int[matrix[0].length];
        int[] minArray = new int[matrix.length];
        int maxIndex = 0;
        int minIndex =0;

        for (int i = 0; i < matrix.length; i++) {
            int min=1000000000;
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j]<min){
                    min = matrix[i][j];
                }
            }
            minArray[minIndex++] = min;

        }

        for (int i = 0; i < matrix[0].length; i++) {
            int max= 0;
            for (int j = 0; j < matrix.length; j++) {
                if(matrix[j][i]>max){
                    max = matrix[j][i];
                }
            }
            maxArray[maxIndex++]= max;

        }
//        System.out.println(Arrays.toString(maxArray));
//        System.out.println(Arrays.toString(minArray));

        ArrayList<Integer> arrayList = new ArrayList<>();
        //check from matrix if it equals to min and max by its i and j

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j]==maxArray[j] && matrix[i][j]==minArray[i]){
                    arrayList.add(matrix[i][j]);
                }
            }
        }
        return arrayList;
    }
}
