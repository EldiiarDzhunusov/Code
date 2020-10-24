import java.util.Scanner;

public class AdjacentArrayElements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();
        String[] numbers1 = numbers.split(" ");
        int[] num = new int[10];
        for (int i = 0; i < numbers1.length; i++) {
            num[i]=Integer.parseInt(numbers1[i]);
        }
        //solution
        

    }
}
