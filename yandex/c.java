import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

//name should be Solution for a class
public class c {
    static final FastReader in = new FastReader();
    static final PrintWriter out = new PrintWriter(System.out);
    public static void main(String[] args) {
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        int[] ans = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            if(arr[i]>max){
                max = arr[i];
            }
        }
        int[] dp = new int[max+1];
        int[] arr2 = Arrays.copyOf(arr,arr.length);
        sort(arr, 0, arr.length - 1);
        for (int i = 0; i < n; i++) {
            if(dp[arr2[i]]>0){

                ans[i] = dp[arr2[i]];
                continue;
            }
            int index = binarySearch(arr,0,arr.length-1,arr2[i]);
            int left = index-1;
            int right = index+1;
            int count = k;
            int sum = 0;
            while(count>0){
                if(left>=0 && right<arr.length){
                    if(Math.min(Math.abs(arr[left]-arr[index]),Math.abs(arr[right]-arr[index]))==Math.abs(arr[left]-arr[index])){
                        sum+=Math.abs(arr[left]-arr[index]);
                        left--;
                    }
                    else{
                        sum+=Math.abs(arr[right]-arr[index]);
                        right++;
                    }
                }
                else if(left<0){
                    sum+=Math.abs(arr[right]-arr[index]);
                    right++;
                }
                else{
                    sum+=Math.abs(arr[left]-arr[index]);
                    left--;
                }
                count--;
            }
            ans[i] = sum;
            dp[arr[index]] = sum;
        }



        for (int i = 0; i < ans.length; i++) {
            out.print(ans[i]+ " ");
        }
        out.close();

    }

    public static int binarySearch(int arr[], int first, int last, int key){
        int mid = (first + last)/2;
        while( first <= last ){
            if ( arr[mid] < key ){
                first = mid + 1;
            }else if ( arr[mid] == key ){
                return mid;

            }else{
                last = mid - 1;
            }
            mid = (first + last)/2;
        }
        //not sure
        return 0;
    }
    public static void merge(int arr[], int l, int m, int r)
    {
        //sort(arr, 0, arr.length - 1);
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

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }

        long nextLong() { return Long.parseLong(next()); }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
