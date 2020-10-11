package HW;

import java.math.BigInteger;
import java.util.Scanner;

public class Palindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger number = scanner.nextBigInteger();
        if(isPalindrome2(number)){
            System.out.println("This number is a palindrome");
        }
        else
            System.out.println("This number is not a palindrome");
    }
    public static boolean isPalindrome2(BigInteger number){
        BigInteger numberCopy= number;
        BigInteger reversed=BigInteger.valueOf(0);
        BigInteger ten = new BigInteger("10");

        while((BigInteger.valueOf(0).compareTo(number))!=0){
            reversed = reversed.multiply(ten);
            reversed = reversed.add((number.divideAndRemainder(ten))[1]);
            number= number.divide(ten);
        }
        if (numberCopy.compareTo(reversed)==0){
            return true;
        }
        else
            return false;

    }
}
