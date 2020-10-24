import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            long num = scanner.nextLong();
            num = Math.abs(num);
            System.out.println(digitsum(num));
        }
        catch (Exception e){
            System.out.println("error");
        }


    }
    public static int digitsum(long num){
        String word = Long.toString(num);
        int ans = 0;
        for (int i = 0; i < word.length(); i++) {
            ans+=Character.getNumericValue(word.charAt(i));
        }
        return ans;

    }
}
