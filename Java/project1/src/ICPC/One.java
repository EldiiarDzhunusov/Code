package ICPC;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        word = word.trim();
        String arr[] = word.split("");
        sol(arr);

    }
    public static void sol(String arr[]){
        int ans = 0;
        int size = arr.length;

        for (int i = 0; i < size; i++) {
            if(arr[i].compareTo("(")==0){
                int opening = 1;
                int closing = 0;
                int full=1;
                for (int j = i+1; j < size; j++) {
                    if(arr[j].compareTo("(")==0){
                        opening++;
                        full++;
                    }
                    else{
                        closing++;
                        full--;
                        if(full<0){
                            break;
                        }
                        if(full==0 && opening == closing){
                            ans++;
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
