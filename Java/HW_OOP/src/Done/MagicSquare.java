package Done;

import java.util.Scanner;

public class MagicSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] nums = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int i1 = 0; i1 < m; i1++) {
                nums[i][i1]=scanner.nextInt();
            }
        }
        if(n==m){
            System.out.println(isMagicSquare(nums,n,m));
        }
        else{
            System.out.println(false);
        }

    }
    public static boolean isMagicSquare(int[][] nums, int n,int m){
        int sum = 0;
        boolean ans = true;
        for (int i = 0; i < n; i++) {
            sum+= nums[0][i];
        }
        //for row
        for (int i = 0; i < n; i++) {
            int sum1 = 0;
            for (int i1 = 0; i1 < m; i1++) {
                sum1+=nums[i][i1];
            }
            if(sum1!=sum){
                ans = false;
            }
        }
        //for columb
        for (int i = 0; i < n; i++) {
            int sum1 = 0;
            for (int i1 = 0; i1 < m; i1++) {
                sum1+=nums[i1][i];
            }
            if(sum1!=sum){
                ans = false;
            }
        }
        int sum1 = 0;
        for (int i = 0; i < n; i++) {
            sum1+= nums[i][i];

        }
        if(sum!=sum1){
            ans = false;
        }
        return ans;




    }
}
