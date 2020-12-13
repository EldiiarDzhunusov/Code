import java.util.Arrays;
import java.util.Scanner;

public class CF686_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t--!=0){
            int n = scanner.nextInt();
            solution(n);

        }
    }
    public static void solution(int n){
        int[] arr = new int[n];
        int counter = 1;
        for (int i = 0; i < n; i++) {
            arr[(i+1)%n] = counter++;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
