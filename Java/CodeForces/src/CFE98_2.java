import java.util.Scanner;

public class CFE98_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t--!=0){
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            solution(arr,n);

        }
    }
    public static void solution(int[] arr, int n){
        
    }
}
