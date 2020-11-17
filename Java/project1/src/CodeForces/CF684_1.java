package CodeForces;

import java.util.Scanner;

public class CF684_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t!=0){
            int n = scanner.nextInt();
            int c0 = scanner.nextInt();
            int c1= scanner.nextInt();
            int h = scanner.nextInt();
            int[] arr = new int[n];
            scanner.nextLine();
            String word = scanner.nextLine();
            for (int i = 0; i < n; i++) {
                arr[i] = Character.getNumericValue(word.charAt(i));
            }
            solution(arr, c0,c1,h);
            t--;
        }
    }
    public static void solution(int[] arr, int c0, int c1, int h) {

        int ans = 0;
        //when 1 are better
        if (c1 < c0) {
            //check if i need to change the values at all
            int diff = c0 - c1;
            if (diff > h) {
                for (int i = 0; i < arr.length; i++) {
                    if(arr[i] == 0) {
                        ans += h;
                        ans += c1;
                    } else {
                        ans += c1;
                    }
                }
            } else {
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == 0) {
                        ans += c0;
                    } else {
                        ans += c1;
                    }
                }
            }
        } else if (c0 < c1) {
            //check if i need to change the values at all
            int diff = c1 - c0;
            if (diff > h) {
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == 1) {
                        ans += h;
                        ans += c0;
                    } else {
                        ans += c0;
                    }
                }
            } else {
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == 0) {
                        ans += c0;
                    } else {
                        ans += c1;
                    }
                }
            }
        }
        else{
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0) {
                    ans += c0;
                } else {
                    ans += c1;
                }
            }
        }
        System.out.println(ans);
    }
}
