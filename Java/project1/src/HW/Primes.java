package HW;/*
A program that prints the prime numbers till some N.
*/

import java.util.Scanner;

public class Primes {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }

    }

    // The method that determines whether a number is a prime or not a prime.
    public static boolean isPrime(int num) {
        if(num==1){
            return false;
        }
        for (int i = 2; i <= num/2; i++) {

            if(num%i==0){
                return false;
            }}

        return true;

    }
}