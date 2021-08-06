import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

/*AUTHOR - ELDIIAR DZHUNUSOV */

public class b {
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
        Solver(){
            int k1 = in.nextInt();
            int m = in.nextInt();
            int k2 = in.nextInt();
            int p2 = in.nextInt();
            int n2 = in.nextInt();

            int roomPerFloor;
            try {
                roomPerFloor = (k2/((p2-1)*m +n2-1));
            }
            catch (Exception e){
                roomPerFloor = 1;
            }
            int floors = k1/roomPerFloor+1;
            int podiezd = floors/m+1;
            out.println(podiezd + " " + (floors-((podiezd-1)*m)));


        }
    }


//        Collections.sort(arrayList);
//        sort 1d
//        sort(arr, 0, arr.length - 1);
//        Sort 2d by the first index
//        Arrays.sort(arr, Comparator.comparingDouble(o -> o[0]));

    public static void swap(int[] arr, int i, int j){
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
    static boolean isPrime(long n)
    {
        if(n==1)return false  ;
        for(long i = 2L; i*i <= n ;i++){ if(n% i ==0){return false; } }
        return true ;
    }

    static boolean isPrime(int n)
    {
        if(n==1)return false  ;
        for(int i = 2; i*i <= n ;i++){ if(n% i ==0){return false ; } }
        return true ;
    }
    public static int gcd(int a, int b )
    {
        if(b==0)return a ;else return gcd(b,a%b) ;
    }

    public static long gcd(long a, long b )
    {
        if(b==0)return a ;else return gcd(b,a%b) ;
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
