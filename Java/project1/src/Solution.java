import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int number = scanner.nextInt();
            solution(number);
        }
    }
    public static void solution(int number){
        int x3 = 0, x5= 0, x7 = 0;
        while((number-3)>=0) {
            if ((number - 7) >= 0) {
                x7++;
                number -= 7;
            }

            else if ((number - 5) >= 0) {
                x5++;
                number -= 5;
            }
            else if (number - 3 >= 0) {
                x3++;
                number -= 3;
            }

        }




        if (number==0){
            System.out.println(x3+" "+x5+" "+x7);
        }
        else{
            System.out.println(-1);
        }
    }
}
