import java.util.Scanner;

public class ZeroFront {
    public static void main(String[] args) {
        try {
            //input
            Scanner scanner = new Scanner(System.in);
            String numbers1 = scanner.nextLine();
            numbers1 = numbers1.trim();
            String[] numbers = numbers1.split(" ");
            int[] list = new int[numbers.length];
            int counter = 0;
            //checking how many zeros
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i].compareTo("0") == 0) {
                    counter++;
                }
            }

            //filling the zeroes
            for (int i = 0; i < counter; i++) {
                list[i] = 0;
            }
            //inserting any other number
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i].compareTo("0") != 0) {
                    //if parser does not work, it will generate an error and catch case will be executed
                    list[counter] = Integer.parseInt(numbers[i]);

                    counter++;
                }
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
