import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

/*AUTHOR - ELDIIAR DZHUNUSOV */

public class d {
    static int mod= 1000000007 ;
    static final FastReader in = new FastReader();
    static final PrintWriter out = new PrintWriter(System.out);
    public static void main(String[] args) {
        new Solver();
        out.flush();
        out.close();
    }
    static class Solver{
        Solver(){
            int n = in.nextInt();
            int p = in.nextInt();
            int[] arr = new int[n]; //процент инфляции
            int[] arr2 = new int[n+1]; //здесь я храню сколько денег в счету
            int[] arr3 = new int[n+1]; //здесь я храню сколько денег стоят 100 рублей в 2006
            int maxDiff = 0;
            int maxDiffIndex = 0;
            arr2[0] = 100;
            arr3[0] = 100;
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
                arr2[i+1]+=arr2[i]+p;
                arr3[i+1]+=arr3[i]+arr[i];
                if(arr2[i+1]-arr3[i+1]>maxDiff){
                    maxDiff= arr2[i+1]-arr3[i+1];
                    maxDiffIndex = i+1;
                }

            }
            out.println(2006+maxDiffIndex);
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
