import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

/*AUTHOR - ELDIIAR DZHUNUSOV */
//works but need to optimize memory usage
public class Solution {
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
            int t = in.nextInt();
            String allCommands[][] = new String[t][];
            for (int i = 0; i < t; i++) {
                allCommands[i] = in.nextLine().split(" ");
            }
            int[] arr = new int[n]; //current
            for (int i = 0; i < n; i++) {
                arr[i] = 0;
            }
            HashSet<Integer> revertSet = new HashSet<>();

            for (int i = 0; i < t; i++) {
                if(allCommands[i][0].toLowerCase(Locale.ROOT).equals("revert")){
                    revertSet.add(Integer.parseInt(allCommands[i][1]));
                }
            }
            int[][] arrTimes = new int[revertSet.size()][n];
            Integer[] trueIndexes = new Integer[t];
            int lastIndexOfArrTimes = 0;
            for (int i = 0; i < t; i++) {
                String[] command = allCommands[i];
                if(revertSet.contains(i)){
                    arrTimes[lastIndexOfArrTimes] =arr.clone();
//                    System.out.println("HEY " + i + " " + Arrays.toString(arrTimes[lastIndexOfArrTimes]));
                    trueIndexes[i] = lastIndexOfArrTimes;
//                    System.out.println("true" + Arrays.toString(trueIndexes));
                    lastIndexOfArrTimes++;
                }
                if(command[0].toLowerCase(Locale.ROOT).equals("set")){
                    arr[Integer.parseInt(command[1])] = Integer.parseInt(command[2]);
                }
                else if(command[0].toLowerCase(Locale.ROOT).equals("get")){
                    out.println(arr[Integer.parseInt(command[1])]);
                }
                else{
                    int num = Integer.parseInt(command[1]);
                    arr = arrTimes[trueIndexes[num]].clone();
                }
            }
//            out.println("arrTimes : " );
//            printArray2d(arrTimes);
//            out.println("trueIndexes: " + Arrays.toString(trueIndexes));
//            out.println("lastIndexOfArrTimes: " + lastIndexOfArrTimes);
//            out.println("ARR" +  Arrays.toString(arr));

        }
    }
    public static void printArray2d(int[][] arr){
        out.println("");
        for (int i = 0; i < arr.length; i++) {
            for (int i1 = 0; i1 < arr[i].length; i1++) {
                out.print(arr[i][i1]+" ");
            }
            out.println("");
        }
        out.println("");
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
