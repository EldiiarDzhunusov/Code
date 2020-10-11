
import java.util.Scanner;

public class ZeroEnd {
    public static void main(String[] args) {
        try {
            //input
            Scanner scanner = new Scanner(System.in);
            String numbers1 = scanner.nextLine();
            numbers1 = numbers1.trim();
            String[] numbers = numbers1.split(" ");
            int[] list = new int[numbers.length];
            int counter = 0;
            int zeros = 0;
            //checking how many zeros


            //inserting any other number
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i].compareTo("0") != 0) {
                    //if parser does not work, it will generate an error and catch case will be executed
                    list[counter] = Integer.parseInt(numbers[i]);
                    counter++;
                }
            }
            for (int i = counter; i < numbers.length; i++) {
                list[i] = 0;
            }

            for (int i = 0; i < list.length; i++) {
                System.out.print(list[i] + " ");
            }
        }
        catch (Exception e){
            System.out.println("Input error");
        }
    }
}
