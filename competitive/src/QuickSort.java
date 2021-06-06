import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{4,3,2,1};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }


    public static void sort(int[] arr, int low, int high ){
        if(low<high){
            int pivot_location = partition(arr, low, high);
            sort(arr,low, pivot_location-1);
            sort(arr,pivot_location+1, high);
        }
    }
    static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];
        int i = (low-1);
        for (int j = low; j <= high - 1; j++) {
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return(i+1);

    }
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
