package HW;

import java.util.Scanner;

public class ShowTwos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(showTwo(num));

    }

    public static String showTwo(int number) {
        String ans=Integer.toString(number)+" =";
        int checker = 0;
        while(number%2==0){
            if (checker ==0){
                number/=2;
                ans+= " "+ Integer.toString(2);
                checker = 1;
            }
            else{
                number/=2;
                ans+= " * "+ Integer.toString(2);
            }
        }
        ans+= " * "+ Integer.toString(number);
        return ans;

    }
}
