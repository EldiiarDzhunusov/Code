import java.util.Scanner;

public class CF698_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t--!=0){
            int q = scanner.nextInt();
            int d = scanner.nextInt();
            int[] arr= new int[q];
            for (int i = 0; i < q; i++) {
                arr[i] = scanner.nextInt();
            }
            solution(q,d,arr);
        }
    }
    public static void solution(int q, int d, int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int checker = 0;
            while(!check(arr[i],d)){
                if(arr[i]<0){
                    checker = 1;
                    break;
                }
                arr[i]-=d;
            }
            if(checker == 1){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }


        }
    }
    public static boolean check(int n, int d){
        String s2 = Integer.toString(d);
        String[] s = Integer.toString(n).split("");
        for (int i = 0; i < s.length; i++) {
            if(s2.compareTo(s[i])==0){
                return true;
            }
        }
        return false;
    }
}



// if number 20 + q then lucky

