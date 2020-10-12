package Quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class SumEvenFibonacciNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(0);
        numbers.add(1);
        int size = 1;
        while(numbers.get(size)<number){
            numbers.add(numbers.get(size-1)+numbers.get(size));
            size++;
        }

        int total= 0;
        for (int i = 0; i <= size; i++) {
            if (numbers.get(i)%2==0 && numbers.get(i)<=number){
                total+=numbers.get(i);

            }
        }

        System.out.println(total);

    }
}

