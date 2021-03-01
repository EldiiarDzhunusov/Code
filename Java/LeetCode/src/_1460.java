public class _1460 {
    public static void main(String[] args) {
        System.out.println(canBeEqual(new int[]{1,2,3,4}, new int[]{2,4,1,3}));
        System.out.println(canBeEqual(new int[]{7}, new int[]{7}));
        System.out.println(canBeEqual(new int[]{3,7,9}, new int[]{3,7,11}));
    }
    public static boolean canBeEqual(int[] target, int[] arr) {
        sort(target, 0, target.length - 1);
        sort(arr, 0, arr.length - 1);
        for (int i = 0; i < target.length; i++) {
            if(target[i]!=arr[i]){
                return false;
            }
        }
        return true;
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
