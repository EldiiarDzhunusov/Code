import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

/*AUTHOR - ELDIIAR DZHUNUSOV */

public class e1 { // Solution
    static int mod= 1000000007 ;
    static final FastReader in = new FastReader();
    static final PrintWriter out = new PrintWriter(System.out);
    public static void main(String[] args) {
//        long time1 = System.nanoTime();

        new Solver();


//        long time2 = System.nanoTime();
//        long timeTaken = time2 - time1;
//        System.out.println("Time taken " + timeTaken + " ns");
        out.flush();
        out.close();

    }
    static class Solver{
        Solver(){
            int n = in.nextInt();
            int m = in.nextInt();
            int l = in.nextInt();
            double[][] arr = new double[n][4];
            String[][] names = new String[n][5];
            String[] names2 = new String[n];
            for (int i = 0; i < n; i++) {
                names[i][0] = in.next();
                names[i][1] = in.next();
                names[i][2] = in.next();
                names[i][3] = in.next();
                names[i][4] = String.valueOf(i);
                names2[i] =names[i][0];
            }
            //need to sort names, its probably where I am getting WA
//            Arrays.sort(names, (a, b) -> (a[0] - b[0]));
//            Arrays.sort(names, Comparator.comparingDouble(o -> o[0]));
//            out.println(Arrays.deepToString(names));
            Arrays.sort(names, new Comparator<String[]>(){
                @Override
                public int compare(final String[] first, final String[] second){
                    // here you should usually check that first and second
                    // a) are not null and b) have at least two items
                    // updated after comments: comparing Double, not Strings
                    // makes more sense, thanks Bart Kiers
                    return first[0].compareTo(
                            second[0]
                    );
                }
            });
//            out.println(Arrays.deepToString(names));



            for (int i = 0; i < n; i++) {
                arr[i][0] = Integer.parseInt(names[i][4]);
                arr[i][1] = Double.parseDouble(names[i][1] );
                arr[i][2] = Integer.parseInt(names[i][2]) ;
                arr[i][3] = Integer.parseInt(names[i][3]);
            }
            Arrays.sort(arr, Comparator.comparingDouble(o -> o[1]));
//            out.println(Arrays.deepToString(arr));

            boolean taken[] = new boolean[m+1];
            if(l==1){
                for (int i = 0; i < n; i++) {
                    if(arr[i][2]==1){
                        if(arr[i][3]==-1){
                            arr[i][2] =0;
                        }
                        if(arr[i][3] >m){
                            arr[i][3] = -1;
                        }
                        else{
                            //zero also will become true
                            taken[(int) arr[i][3]] = true; //занял место
                        }
                    }
                }
                int index =1;
                for (int i = 0; i < n; i++) {
                    if(arr[i][2]==0){
                        if(arr[i][3]==0){
                            continue;
                        }
                        if(index>m){
                            arr[i][3] = -1;
                        }
                        else{
                            boolean check = false;
                            if(taken[index]){
                                index++;
                                if(index>m){
                                    arr[i][3]=-1;
                                    check=true;
                                    break;
                                }
                            }
                            if(check){
                                continue;
                            }else{
                                arr[i][3] = index++;
                            }
                        }
                    }
                }
            }
            else{
                int index = 1;
                for (int i = 0; i < n; i++) {
                    if(arr[i][3]==0){
                        continue;
                    }
                    if(arr[i][3]==-1){
                        arr[i][2] =0;
                    }
                    if(index>m){
                        arr[i][3] = -1;
                        continue;
                    }
                    arr[i][3] = index;
                    index++;
                }
            }

//            out.println(Arrays.deepToString(arr));

            Arrays.sort(arr, Comparator.comparingDouble(o -> o[0]));
            print(arr,names2,n);





            //I dont need to sort for the second time because I already have indexes
            //Noo but the indexes are different, lets still try sort
            // I know how to do it in O(N)
        }
    }
    public static void print(double arr[][], String[] names2,int n){
        for (int i = 0; i < n; i++) {
            out.println(names2[(int) arr[i][0]] + " " + arr[i][1] + " " + (int)arr[i][2] + " " + (int)arr[i][3]);
        }

    }


//        Collections.sort(arrayList);
//        sort 1d
//        sort(arr, 0, arr.length - 1);
//        Sort 2d by the first index
//        Arrays.sort(arr, (a, b) -> a[0] - b[0]);



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
