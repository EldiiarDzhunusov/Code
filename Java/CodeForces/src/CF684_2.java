import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class CF684_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t!=0){
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int size = n*k;
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i]= scanner.nextInt();
            }
            solution(arr,n,k,size);
            t--;
        }
    }
    public static void solution(int[] arr, int n, int k,int size){
        int[][] matrix =new int[k][n];
        double temp1 = ((double)n)/2;
        int medianPos =(int)Math.ceil(temp1);
        int counter =0;
        for (int i = 0; i <medianPos-1; i++) {
            for (int j = 0; j < k; j++) {
                matrix[j][i] = arr[counter++];
            }
        }
        BigInteger answer = new BigInteger("0");
        //int ans= 0;
        for (int i = 0; i < k; i++) {
            for (int j = medianPos-1; j < n; j++) {
                matrix[i][j] = arr[counter++];
                if(j==medianPos-1){
                    //ans+=matrix[i][j];
                    answer= answer.add(BigInteger.valueOf(matrix[i][j]));
                }
            }
        }
//        for (int i = 0; i < k; i++) {
//            System.out.println(Arrays.toString(matrix[i]));
//        }
        System.out.println(answer);

    }
}
