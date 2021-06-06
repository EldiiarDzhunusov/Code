import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

/*AUTHOR - ELDIIAR DZHUNUSOV */

public class e {
    static int mod= 1000000007 ;
    static final FastReader in = new FastReader();
    static final PrintWriter out = new PrintWriter(System.out);
    public static void main(String[] args) {
        long t = 1;
        for (long i = 1; i <= t; i++) {
            new Solver();
        }
        out.flush();
        out.close();

    }
    static class Solver{
        //my sort does not work
        Solver() {
            int n = in.nextInt();
            int m = in.nextInt();
            int l = in.nextInt();
            String[][] names = new String[n][5];
            for (int i = 0; i < n; i++) {
                names[i][0] = in.next();
                names[i][1] = in.next();
                names[i][2] = in.next();
                names[i][3] = in.next();
                names[i][4] = Double.toString(i);
            }

//            long time1 = System.nanoTime();
            Arrays.sort(names, Comparator.comparing(a -> a[0]));
//            out.println(Arrays.deepToString(names));
            Arrays.sort(names, Comparator.comparing(o -> Double.valueOf(o[1])));
//            out.println(Arrays.deepToString(names));
            //checked till here, works as expected
            boolean taken[] = new boolean[m+1];
            if(l==1){
                for (int i = 0; i < n; i++) {
                    if(names[i][2].equals("1")){
                        if(names[i][3].equals("-1")){
                            names[i][2] = "0";
                            continue;
                        }
                        if(Integer.parseInt(names[i][3])>m){
                            // what if there is not enough 0? like not enough in the order
                            names[i][3] = "-1";
                        }
                        else{
                            taken[Integer.parseInt(names[i][3])] = true; //RE
                        }
                    }
                }
                int index1 = 1;
                boolean limitNotReached = true;
                for (int i = 0; i < n; i++) {
                    if(names[i][2].equals("0")){
                        if(!names[i][3].equals("0")){
                            // а если m == N
                            if(!limitNotReached){
                                names[i][3] = "-1";
                                continue;
                            }
                            while(taken[index1]){
                                index1++;
                                if(index1>m){
                                    limitNotReached=false;
                                    break;
                                }
                            }
                            if(limitNotReached){
                                names[i][3] = Integer.toString(index1);
                                taken[index1] =true;
                            }else{
                                names[i][3] = "-1";
                            }
                        }

                    }
                }
            }
            //l==0
            else{
                int index = 0;
                for (int i = 0; i < n; i++) {
                    if(names[i][3].equals("-1")){
                        names[i][2] = "0";
                    }
                    if(index>m){
                        names[i][3] = "-1";
                    }
                    else if(!names[i][3].equals("0")){
                        names[i][3] = String.valueOf(index);
                        index++;
                    }
                }
            }

            //output not in correct order
//            out.println(Arrays.toString(taken));
            Arrays.sort(names, Comparator.comparing(o -> Double.valueOf(o[4])));
            print(names,n);
//            long time2 = System.nanoTime();
//            long timeTaken = time2 - time1;
//            System.out.println("Time taken " + timeTaken + " ns");

        }
    }
    static void print(String[][] names, int n){
        for (int i = 0; i < n; i++) {
            out.println(names[i][0] + " " +names[i][1] + " " + names[i][2] + " " + names[i][3]);
        }
    }

    static boolean isPower(int n, int p){
        if(p==0) return n==1;
        return (Double.compare(Math.pow(n,1.0/p),(int)Math.pow(n,1.0/p))==0);
    }
    static boolean isPower(long n, long p){
        if(p==0L) return n==1L;
        return (Double.compare(Math.pow(n,1.0/p),(long)Math.pow(n,1.0/p))==0);
    }
    public static long nCr(int n,int k) {
        long ans=1L;
        k=k>n-k?n-k:k;
        int j=1;
        for(;j<=k;j++,n--)
        {
            if(n%j==0)
            {
                ans*=n/j;
            }else if(ans%j==0)
            {
                ans=ans/j*n;
            }else
            {
                ans=(ans*n)/j;
            }
        }
        return ans;
    }

    public static ArrayList<Integer> allFactors(int n)
    {
        ArrayList<Integer> list = new ArrayList<>() ;

        for(int i = 1; i*i <= n ;i++)
        {
            if( n % i == 0)
            {
                if(i*i == n)list.add(i) ;
                else{ list.add(i) ;list.add(n/i) ; }
            }
        }

        return list ;
    }


    public static ArrayList<Long> allFactors(long n)
    {
        ArrayList<Long> list = new ArrayList<>() ;

        for(long i = 1L; i*i <= n ;i++)
        {
            if( n % i == 0)
            {
                if(i*i == n) list.add(i) ;
                else{  list.add(i) ; list.add(n/i) ; }

            }
        }

        return list ;
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
