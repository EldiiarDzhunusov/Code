import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

/*AUTHOR - ELDIIAR DZHUNUSOV */

public class a {
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
            int x = in.nextInt();
            int y = in.nextInt();
            /*
            * Принцип решения в обеих задачах одинаковый,
            * я сперва считаю количество внутренних чисел, после считаю количество (ну или наоборот)
            * чисел на последнем слою либо прямоугольника либо треугольника
            *  */
            //part1
            int layer = Math.max(Math.abs(x),Math.abs(y));

            int number = 0;
            //максимальное число внутри layer
            for (int i = 1; i < layer ; i++) {
                number+= 8*i;
            }

            boolean needed= true;
            long ans = 0;
            //прорабатываю каждую сторону последнего layer
            for (int i = layer, j =-1*(layer-1); j <= layer; j++) {
                ans++;
                if(i==x && j ==y){
                    needed = false;
                    break;
                }
            }
            if(needed){
                for (int i = layer-1,j = layer; i > -layer; i--) {

                    ans++;
                    if(i==x && j ==y){
                        needed = false;
                        break;
                    }
                }
            }
            if(needed){
                for(int i = -layer,j=layer; j>=-layer;j--){
                    ans++;
                    if(i==x && j ==y){
                        needed = false;
                        break;
                    }
                }
            }
            if(needed){
                for(int i = (-layer)+1,j= -layer; i<=layer;i++){
                    ans++;
                    if(i==x && j ==y){
                        needed = false;
                        break;
                    }
                }
            }

            out.println(ans+number);

            //part2
            int n = in.nextInt();
            int num = 0; //буду считать числа внутри треугольника
            int triangle  = 0; // сколько внутренних треугольников
            int power = 1;
            while(num<n){
                num+=(9*power);
                power++;
                triangle++;
            }
            num-=(9*(power-1));
            num++;
            x = (2*(triangle-1))+1; //координата X
            y= -(triangle-1);  //координата y

            //прорабатываю каждую сторону последнего layer
            needed=true;
            for (int i = 0; i <  (triangle * 3)-1; i++) {
                if(num==n){
                    needed=false;
                    break;
                }
                num++;
                x--;
                y++;
            }
            if(needed){
                for (int i = 0; i < triangle * 3; i++) {
                    if(num==n){
                        needed=false;
                        break;
                    }
                    num++;
                    y--;
                }
            }
            if(needed){
                for (int i = 0; i < triangle * 3; i++) {
                    if(num==n){
                        needed=false;
                        break;
                    }
                    num++;
                    x++;
                }
            }
            out.println(x+" "+y);

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
