package Quiz;

import java.util.Arrays;
import java.util.Scanner;

public class merge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size1 = scanner.nextInt();
        int[] arr1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            arr1[i] = scanner.nextInt();
        }

        int size2 = scanner.nextInt();
        int[] arr2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            arr2[i] = scanner.nextInt();
        }

        int[] ans = new int[size1+size2];
        int counter = 0;
        for (int i = 0; i < size1; i++) {
            ans[counter]=arr1[i];
            counter++;
        }
        for (int i = 0; i < size2; i++) {
            ans[counter]=arr2[i];
            counter++;
        }
        Arrays.sort(ans);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }


    }
}
