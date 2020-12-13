import java.util.Scanner;

public class Decimal2Binary {
    public static void main(String[] args) {
        // you may modify the code below, but try to preserve the program structure
        int decimalNumber;
        Scanner console = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        decimalNumber = console.nextInt();

        System.out.printf("Binary of %d is %s", decimalNumber, decimalToBinary(decimalNumber));
    }

    private static String decimalToBinary(int decimalNumber) {
        String binaryNumber = "";
        while(decimalNumber>0){
            if(decimalNumber%2==1){
                binaryNumber+="1";
            }
            else{
                binaryNumber+="0";
            }
            decimalNumber/=2;
        }
        while(binaryNumber.length()<8){
            binaryNumber+="0";
        }
        String ans ="";
        for (int i = 7; i >= 0; i--) {
            ans+= binaryNumber.substring(i,i+1);
        }
        return ans;
    }
}