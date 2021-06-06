import java.util.Arrays;
import java.util.Comparator;

public class ITMO {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(mergeTwoSortedArray(new int[]{1,2,3,4,5,6},new int[]{2,3,4,5,6,7})));
//        System.out.println(Arrays.toString(smallerItemInFirstArrayForEveryItemInSecondArray(new int[]{4,5,6},new int[]{5,4,5,10,2})));
    }
    public static int[] mergeTwoSortedArray(int[] arr1, int arr2[]){
        //merges two sorted arrays
        //O(n) solution
        int i = 0;
        int j =0;
        int len1 = arr1.length;
        int len2 = arr2.length;
        int[] arr3 = new int[len1+len2];
        while(len1>i || len2>j){
            if(j==len2 || len1>i && arr1[i]<arr2[j]){
                arr3[i+j] = arr1[i];
                i++;
            }
            else{
                arr3[i+j] = arr2[j];
                j++;
            }
        }
        return arr3;
    }
    public static int[] smallerItemInFirstArrayForEveryItemInSecondArray(int[] arr1, int[] arr2){
        //for every item in the second array it will find the number of items in the first array
        //that is smaller than the number in the second array, and return new array.
        //Naive approach would be O(n^2) but it has a better solution
        //O(nlogn) solution


        int len1 = arr1.length;
        int len2 = arr2.length;
        int arr2Copy[][] = new int[len2][2];
        for (int i = 0; i < len2; i++) {
            arr2Copy[i][0] = arr2[i];
            arr2Copy[i][1] = i;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2Copy, Comparator.comparingDouble(o -> o[0]));
        int i = 0;
        int j = 0;
        int[] arr3 = new int[len2];
        while(j<len2){
            if(i<len1 && arr1[i]<arr2Copy[j][0]){
                i++;
            }
            else{
                arr3[arr2Copy[j][1]] = i;
                j++;
            }
        }
        return arr3;
    }

}
