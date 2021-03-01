import java.util.ArrayList;
import java.util.List;

public class _1403 {
    public static void main(String[] args) {
        System.out.println(minSubsequence(new int[]{4,3,10,9,8}));
        System.out.println(minSubsequence(new int[]{4,4,7,6,7}));
        System.out.println(minSubsequence(new int[]{6}));
        System.out.println(minSubsequence(new int[]{ 4,4,7,6,7}));

    }
    public static List<Integer> minSubsequence(int[] nums) {
        sort(nums, 0, nums.length - 1);
        ArrayList<Integer> arrayList = new ArrayList<>();
        int sumNew= nums[nums.length-1];
        arrayList.add(nums[nums.length-1]);
        int sumOld = 0;
        for (int i = 0; i < nums.length-1; i++) {
            sumOld+=nums[i];
        }
        int index = nums.length-2;
        while(sumNew<=sumOld){
            sumNew+=nums[index];
            sumOld-=nums[index];
            arrayList.add(nums[index]);
            index--;

        }
        return arrayList;
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
