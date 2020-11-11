import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        //inputs
        Scanner scanner = new Scanner(System.in);
        int arr[][]= new int[30][20];
        int sizeI = 30;
        int sizeJ = 20;
        for (int i = 0; i < sizeI; i++) {
            String word = scanner.nextLine();
            word = word.trim();
            String temp[] = word.split(",");
            for (int j = 0; j < temp.length; j++) {
                arr[i][j] = Integer.parseInt(temp[j]);
            }
        }
        //solution

        for (int i = 0; i < sizeI; i++) {
            if(i%2==0){
                Descending(arr[i]);
            }
            else{
                Ascending(arr[i]);
            }
        }
        //output
        for (int i = 0; i < sizeI; i++) {
            System.out.print(arr[i][0]);
            for (int j = 1; j < sizeJ; j++) {
                System.out.print(","+arr[i][j]);
            }
            System.out.println();
        }

    }
    public static void Ascending(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
    public static void Descending(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] < arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
}
