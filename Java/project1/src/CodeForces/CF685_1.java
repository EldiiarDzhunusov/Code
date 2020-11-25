package CodeForces;

import java.util.Scanner;

public class CF685_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t--!=0){
            int n = scanner.nextInt();
            solution(n);


        }
    }
    public static void solution(int n){
        int ans =0;
        while(n>1){
            int divisor = 0;

            //check if a prime
            boolean cond = false;
            for (int i = 2; i <= n/2; i++) {
                if(n%i==0){
                    cond=true;
                    break;
                }
            }
            if(cond){
                for (int i = n-1; i > 0; i--) {
                    if(n%i==0){
                        divisor = i;
                        break;
                    }
                }
            }
            if(divisor>1){
                n/=divisor;
                ans++;

            }
            else{
                n--;
                ans++;
            }

        }
        System.out.println(ans);
    }
}
