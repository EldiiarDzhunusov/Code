public class LC_17_12_20 {
    public static void main(String[] args) {
        int[] A = { 1, 2};
        int[] B = {-2,-1};
        int[] C = {-1, 2};
        int[] D = { 0, 2};
        int ans = fourSumCount(A,B,C,D);
        System.out.println(ans);
    }
    public static int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        sort(A,0,A.length-1);
        sort(B,0,A.length-1);
        sort(C,0,A.length-1);
        sort(D,0,A.length-1);
        int ans =0;
        for (int a = 0; a < A.length; a++) {
            for (int b = 0; b < B.length; b++) {
                for (int c = 0; c < C.length; c++) {
                    for (int d = 0; d < D.length; d++) {
                        if(A[a]+B[b]+C[c]+D[d]>0){
                            break;
                        }
                        else if(A[a]+B[b]+C[c]+D[d]==0){
                            ans++;
                        }
                    }
                }
            }
        }
        return ans;
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

    public static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
