import java.util.Scanner;

public class Binary2Decimal {
    public static void main(String[] args) {
        // you may modify the code below, but try to preserve the program structure
        int binaryNumber;
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        binaryNumber = console.nextInt();

        System.out.printf("Decimal of %d is %d", binaryNumber, binaryToDecimal(binaryNumber));
    }

    private static int binaryToDecimal(int binaryNumber) {
        int decimalNumber=0;

        String number = Integer.toString(binaryNumber);
        for (int i = number.length()-1, j=0; i >=0; i--,j++) {
            decimalNumber += Character.getNumericValue(number.charAt(j))*Math.pow(2,i);
        }

        return decimalNumber;
    }
}