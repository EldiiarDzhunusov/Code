package HW;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(">>>");
        int age = scanner.nextInt();
        if(age <150 && age>18){
            System.out.println("Old enough!");
        }
        else if(age<=18 && age>0){
            System.out.println("Too young");
        }
        else{
            System.out.println("Incorrect age");
        }
    }
}
