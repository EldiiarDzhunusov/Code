//Write a Java program that accepts an integer ( n ) and computes the value of n+nn+nnn. In case of wrong input, you must print out text "error".
package Quiz;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            number = Math.abs(number);
            String s1 = Integer.toString(number);
            String s2 = Integer.toString(number);
            s2+=Integer.toString(number);
            String s3 = Integer.toString(number);
            s3+=Integer.toString(number);
            s3+=Integer.toString(number);
            int ans = Integer.parseInt(s1) + Integer.parseInt(s2) + Integer.parseInt(s3);
            System.out.println(s1+" + "+s2+" + "+s3+" = "+ans);
        }
        catch (Exception e){
            System.out.println("error");
        }

    }
}
