package Done;

import java.util.Scanner;

public class GPA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(">>>");
        double grade = scanner.nextDouble();

        if (grade <0 || grade >100){
            System.out.println("Incorrect grade!");
        }
        else if(grade >= 93){
            System.out.println("A 4.0");
        }
        else if (grade>=90){
            System.out.println("A- 3.67");
        }
        else if (grade>=87){
            System.out.println("B+ 3.33");
        }
        else if (grade>=83){
            System.out.println("B 3.0");
        }
        else if (grade>=80){
            System.out.println("B- 2.67");
        }
        else if (grade >=77){
            System.out.println("C+ 2.33");
        }
        else if(grade >= 70){
            System.out.println("C 2.0");
        }
        else if (grade >=60){
            System.out.println("D 1.0");
        }
        else{
            System.out.println("F 0.0");
        }


    }
}
