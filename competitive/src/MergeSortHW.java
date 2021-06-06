import java.util.Arrays;
import java.util.Comparator;

public class MergeSortHW {
    public static void main(String[] args) {

        int arr[][] = new int[100000][2];
        for (int i = 0; i < 100000; i++) {
            arr[i][0] = (int)Math.floor(Math.random()*(100-0+1)+0);
            arr[i][1] = i;
        }
        System.out.println(Arrays.toString(arr));
        long time1 = System.nanoTime();
//        sort(arr,0,arr.length-1);
//        Arrays.sort(arr);
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);
//        Arrays.sort(arr, Comparator.comparingDouble(o -> o[0]));
//        bubbleSort(arr);
        long time2 = System.nanoTime();
        long timeTaken = time2 - time1;
//        System.out.println(Arrays.toString(arr));

        System.out.println("Time taken " + timeTaken + " ns");
        System.out.println(Arrays.deepToString(arr));

    }
    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void sort(int[] arr, int left, int right){

        if(left>=right){
            return;
        }
        int mid = left+(right-left)/2;
        sort(arr,left,mid);
        sort(arr,mid+1,right);
        merge(arr,left,right);

    }
    public static void merge(int[] arr, int left,int right){
        int mid = left + (right-left)/2;
        int[] A = new int[mid-left+1];
        int[] B = new int[right-mid];

        for (int i = left, index = 0; i <= mid;index++, i++) {
            A[index] = arr[i];
        }
        for (int i = mid+1,index = 0; i <= right;index++, i++) {
            B[index] = arr[i];
        }

        int index = left;
        int index1 = 0;
        int index2 = 0;
        while(true){
            if(index1>=A.length || index2>=B.length){
                break;
            }
            if(A[index1]<B[index2]){
                arr[index]= A[index1];
                index++; index1++;
            }
            else{
                arr[index]= B[index2];
                index++;      index2++;
            }
        }
        while(index1<A.length){
            arr[index]= A[index1];
            index++; index1++;
        }
        while(index2<B.length){
            arr[index]= B[index2];
            index++;     index2++;
        }

    }
}
