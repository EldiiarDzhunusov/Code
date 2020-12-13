import java.util.Arrays;

public class algoProj {

    public static void main(String[] args) {
        int[][] arr = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                arr[i][j]=0;
            }
        }
        sol(arr,5,5);
        for (int i = 0; i < 10; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
    public static void sol(int[][] arr, int i, int j){
        if(arr[i][j] ==1  || i<=0 || i>=9){
            return;
        }
        else{
            if(i>=0 && arr[i-1][j]!=1){
                arr[i][j]=1;
                sol(arr,i-1,j);
            }
            if(i<9 && arr[i+1][j]!=1){
                arr[i][j]=1;
                sol(arr,i+1,j);
            }
        }
    }
}
