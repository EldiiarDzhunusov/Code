import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

/*AUTHOR - ELDIIAR DZHUNUSOV */

public class c {
    static int mod= 1000000007 ;
    static final FastReader in = new FastReader();
    static final PrintWriter out = new PrintWriter(System.out);
    static HashSet<Integer> citiesIncluded = new HashSet<>();
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
            //insert your code here
            // Ошибки в логике, 1) моя дорога не двух сторонняя
            // 2) может случиться бесконечный луп но это зависит от тест кейсов
            // если все вертисы будут направлены на друг друга, тогда конец моей программе
            // надо это проверить как нибудь
            int cities = in.nextInt();
            int n = in.nextInt();

            int start = in.nextInt();
            int destination = in.nextInt();
            int[][] arr = new int[n][2];
            for (int i = 0; i < n; i++) {
                arr[i][0] = in.nextInt();
                arr[i][1] = in.nextInt();
            }
            Arrays.sort(arr, Comparator.comparingDouble(o -> o[0]));
            int temp = arr[0][0];

            HashMap<Integer,ArrayList<Integer>> hashMap = new HashMap<>();
            ArrayList<Integer> temparray = new ArrayList<>();
            temparray.add(arr[0][1]);
            hashMap.put(arr[0][0],temparray);
            for (int i = 1; i < arr.length; i++) {
                if(arr[i][0]==temp){
                    ArrayList<Integer> arrayList = hashMap.get(arr[i][0]);
                    arrayList.add(arr[i][1]);
                }
                else{
                    temp=arr[i][0];
                    ArrayList<Integer> arrayTemp = new ArrayList<>();
                    arrayTemp.add(arr[i][1]);
                    hashMap.put(arr[i][0],arrayTemp);
                }
            }
//            out.println("HashMap: " + hashMap);
            traverse(hashMap,start,destination,"");
//            out.println("Set: " + citiesIncluded);
            out.println(cities-citiesIncluded.size());

        }
    }
    public static void traverse(HashMap<Integer,ArrayList<Integer>> hashMap, int city, int destination, String road){


//        out.println("City I am in: " + city + " Destination: " + destination);
        if(city==destination){
            road+=" " + String.valueOf(destination);

            String[] cities = road.trim().split(" ");
            for (int i = 0; i < cities.length; i++) {
                citiesIncluded.add(Integer.parseInt(cities[i]));
            }
            return;
        }
        if(!hashMap.containsKey(city)){
            return;
        }
        else {
            ArrayList<Integer> arrayList = hashMap.get(city);
            for (int i = 0; i < arrayList.size(); i++) {
                //            System.out.println(road);
                traverse(hashMap, arrayList.get(i), destination, road + " " + city);
            }
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
