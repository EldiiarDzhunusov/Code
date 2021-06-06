import java.util.Scanner;

public class RightBracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        possible("",0,0,n);
    }
    public static void possible(String s, int open, int closed, int n){
        if(s.length()==n*2){
            System.out.println(s);
            return;
        }
        if(open<n){
            possible(s+"(",open+1,closed,n);
        }
        if(closed<open){
            possible(s+")",open,closed+1,n);
        }
    }
}
