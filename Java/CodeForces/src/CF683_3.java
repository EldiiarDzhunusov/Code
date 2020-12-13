import java.util.Scanner;

public class CF683_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t!=0){
            int n= scanner.nextInt();
            int w = scanner.nextInt();
            int arr[] = new int[n];
            int arr2[]= new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
                arr2[i] = Math.abs(arr[i]-w);
            }
            solution(arr,arr2,w);
            t--;
        }
    }
    public static void solution(int[] arr, int[] arr2, int w){

    }
}
