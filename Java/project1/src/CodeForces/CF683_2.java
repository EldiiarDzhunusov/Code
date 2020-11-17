package CodeForces;
//not solved
import java.util.Scanner;

public class CF683_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t!=0){
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[][] arr = new int[n][m];
            int neg = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j]= scanner.nextInt();
                    if(arr[i][j]<0){
                        neg++;
                    }

                }
            }
            solution(arr,n,m,neg);
            t--;
        }
    }
    public static void solution(int[][] arr,int n, int m,int neg){
        int sum = 0;
        if(neg>1){
            for (int i = 0; i < n; i++) {
                for (int i1 = 0; i1 < m; i1++) {
                    sum+=Math.abs(arr[i][i1]);
                }
            }
        }
        else{
            for (int i = 0; i < n; i++) {
                for (int i1 = 0; i1 < m; i1++) {
                    sum+=(arr[i][i1]);
                }
            }
        }
        System.out.println(sum);
    }
}

