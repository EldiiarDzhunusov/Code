import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

//name should be Solution for a class
public class a {
    static final FastReader in = new FastReader();
    static final PrintWriter out = new PrintWriter(System.out);
    public static void main(String[] args) {
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(solve(arr,n));
        out.close();
    }

    public static int solve(int[] arr, int n){
        boolean check = true;
        int ans= 0;
        for (int i = 0; i < n-1; i++) {
            if(arr[i]>arr[i+1]){
                return -1;
            }
            if(arr[i]!=arr[i+1]){
                check=false;
            }
            while(arr[i]!=arr[i+1]){
                arr[i]++;
                ans++;
            }
        }
        if(check){
            return 0;
        }
        return ans;

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
