import java.util.Arrays;
import java.util.HashSet;

public class _1051 {
    public static void main(String[] args) {
        System.out.println(heightChecker(new int[]{1,1,4,2,1,3}));
        System.out.println(heightChecker(new int[]{5,1,2,3,4}));
        System.out.println(heightChecker(new int[]{1,2,3,4,5}));
        System.out.println(heightChecker(new int[]{2,1,2,1,1,2,2,1})); //4
    }
    public static int heightChecker(int[] heights) {
        int[] arrSorted = Arrays.copyOf(heights,heights.length);
        sort(arrSorted, 0, arrSorted.length - 1);
        HashSet<Integer> hashSet= new HashSet<>();

        for (int i = 0; i < arrSorted.length; i++) {
            if(arrSorted[i]!=heights[i]){
                int index = findIndex(heights,i,arrSorted[i]);
                int temp = heights[i];
                heights[i] = heights[index];
                heights[index] = temp;
                hashSet.add(i);
                hashSet.add(index);
            }
        }
        return hashSet.size();
    }
    public static int findIndex(int[] heights, int i,int num){
        for (int j = heights.length - 1; j >= i; j--) {
            if(heights[j]==num){
                return j;
            }
        }

        return 0;
    }
    public static void merge(int arr[], int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;
        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void sort(int arr[], int l, int r)
    {
        if (l < r) {
            int m = (l + r) / 2;

            sort(arr, l, m);
            sort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }
}
