package CodeForces;

import java.util.Scanner;

public class YetAnotherBookshelf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t!=0){
            int size = scanner.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = scanner.nextInt();
            }
            solution(arr, size);
            t--;
        }
    }
    public static void solution(int[] arr, int size){
        int index = 0;
        for (int i = 0; i < size; i++) {
            if(arr[i]==1){
                index = i;
            }
        }
        int ans = 0;
        int start = 0;
        for (int i = 0; i <= index; i++) {
            if(start == 1 && arr[i]==0){
                ans++;
            }
            if(arr[i]==1){
                start = 1;
            }
        }
        System.out.println(ans);
    }
}
