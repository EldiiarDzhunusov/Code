import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

//name should be Solution for a class
public class b {
    static final FastReader in = new FastReader();
    static final PrintWriter out = new PrintWriter(System.out);
    public static void main(String[] args) {
        int n = in.nextInt();
        String[][] arr = new String[n][];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextLine().split("");
        }
        int m =in.nextInt();
        String[] requests = new String[m];
        for (int i = 0; i < m; i++) {
            requests[i] = in.nextLine();
        }
        for (int i = 0; i < requests.length; i++) {
            String[] word = requests[i].split(" ");
            int people = Integer.parseInt(word[0]);
            String side = word[1];
            String position = word[2];
            if(!reserve(arr,people,side,position)){
                out.println("Cannot fulfill passengers requirements");
            }
        }
//        solve(arr,requests);
        out.close();
    }
    public static boolean reserve(String[][] seats, int people, String side, String position){
        //for left side
        String[] alp = {"A","B","C","_","D","E","F"};
        for (int i = 0; i < seats.length; i++) {
            if(check(seats[i],people,side,position)){
                if(side.equals("left")){
                    //left
                    if(position.equals("aisle")){
                        int seat = 2;
                        ArrayList<String> arrayList = new ArrayList<>();
                        for (int j = 0; j < people; j++) {
                            seats[i][seat]="X";
                            arrayList.add(" " + (i+1)+""+alp[seat]);
                            seat--;
                        }
                        Collections.sort(arrayList);
                        out.print("Passengers can take seats:" );
                        for(String x: arrayList){
                            out.print(x);
                        }
                        out.print("\n");
                        for (int ii = 0; ii < seats.length; ii++) {
                            for (int iii = 0; iii < seats[ii].length; iii++) {
                                out.print(seats[ii][iii]);
                            }
                            out.print("\n");
                        }
                        seat = 2;
                        for (int j = 0; j < people; j++) {
                            seats[i][seat]="#";
                            seat--;
                        }
                        return true;
                    }
                    else{
                        int seat = 0;
                        ArrayList<String> arrayList = new ArrayList<>();
                        for (int j = 0; j < people; j++) {
                            seats[i][seat]="X";
                            arrayList.add(" " + (i+1)+""+alp[seat]);
                            seat++;
                        }
                        Collections.sort(arrayList);
                        out.print("Passengers can take seats:" );
                        for(String x: arrayList){
                            out.print(x);
                        }
                        out.print("\n");
                        for (int ii = 0; ii < seats.length; ii++) {
                            for (int iii = 0; iii < seats[ii].length; iii++) {
                                out.print(seats[ii][iii]);
                            }
                            out.print("\n");
                        }
                        seat = 0;
                        for (int j = 0; j < people; j++) {
                            seats[i][seat]="#";
                            seat++;
                        }
                        return true;
                    }
                }
                else{
                    //right
                    if(position.equals("aisle")){
                        int seat = 4;
                        ArrayList<String> arrayList = new ArrayList<>();
                        for (int j = 0; j < people; j++) {
                            seats[i][seat]="X";
                            arrayList.add(" " + (i+1)+""+alp[seat]);
                            seat++;
                        }
                        Collections.sort(arrayList);
                        out.print("Passengers can take seats:" );
                        for(String x: arrayList){
                            out.print(x);
                        }
                        out.print("\n");
                        for (int ii = 0; ii < seats.length; ii++) {
                            for (int iii = 0; iii < seats[ii].length; iii++) {
                                out.print(seats[ii][iii]);
                            }
                            out.print("\n");
                        }
                        seat = 4;
                        for (int j = 0; j < people; j++) {
                            seats[i][seat]="#";
                            seat++;
                        }
                        return true;
                    }
                    else{
                        int seat = 6;
                        ArrayList<String> arrayList = new ArrayList<>();
                        for (int j = 0; j < people; j++) {
                            seats[i][seat]="X";
                            arrayList.add(" " + (i+1)+""+alp[seat]);
                            seat--;
                        }
                        Collections.sort(arrayList);
                        out.print("Passengers can take seats:" );
                        for(String x: arrayList){
                            out.print(x);
                        }
                        out.print("\n");
                        for (int ii = 0; ii < seats.length; ii++) {
                            for (int iii = 0; iii < seats[ii].length; iii++) {
                                out.print(seats[ii][iii]);
                            }
                            out.print("\n");
                        }
                        seat = 6;
                        for (int j = 0; j < people; j++) {
                            seats[i][seat]="#";
                            seat--;
                        }
                        return true;
                    }
                }

            }
        }
        return false;

    }
    public static boolean check(String[] seat, int people, String side, String position){
        //finished, should work

        if(side.equals("left")){
            if(position.equals("aisle")){
                int index = 2;
                for (int i = 0; i < people; i++) {
                    if(seat[index].equals("#")){
                        return false;
                    }
                    index--;
                }
                return true;
            }
            else{
                int index = 0;
                for (int i = 0; i < people; i++) {
                    if(seat[index].equals("#")){
                        return false;
                    }
                    index++;
                }
                return true;
            }
        }
        else{
            if(position.equals("aisle")){
                int index = 4;
                for (int i = 0; i < people; i++) {
                    if(seat[index].equals("#")){
                        return false;
                    }
                    index++;
                }
                return true;
            }
            else{
                int index = 6;
                for (int i = 0; i < people; i++) {
                    if(seat[index].equals("#")){
                        return false;
                    }
                    index--;
                }
                return true;
            }
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
