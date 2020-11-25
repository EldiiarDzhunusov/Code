package Other;

import java.util.Scanner;

public class WC07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t--!=0){
            int n = scanner.nextInt();
            int[] arr =new int[n];
            int candies = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
                candies+=arr[i];
            }
            sol(arr,n,candies);
        }
    }
    public static void sol(int[] arr, int size, int num1){
        int candies = (int) Math.ceil((double)num1 / size);
        int extra = 0;
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>candies){
                ans+=arr[i]-candies;
                extra+=arr[i]-candies;
            }
            else if(arr[i]<candies){
                extra+=arr[i]-candies;
            }
        }
        if(extra<0){
            ans+=Math.abs(extra);
        }
        System.out.println(ans);
    }
}
