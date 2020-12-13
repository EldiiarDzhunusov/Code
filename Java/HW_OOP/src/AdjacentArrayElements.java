import java.util.Scanner;

public class AdjacentArrayElements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();
        numbers = numbers.trim();
        String[] numbers1 = numbers.split(" ");
        if(numbers1.length!=10){
            System.out.println("Error");
        }
        else{
            try{
                int[] num = new int[10];
                for (int i = 0; i < numbers1.length; i++) {
                    num[i]=Integer.parseInt(numbers1[i]);
                }
                int con = num[0];
                int diff = 0;
                int ans = 0;
                for (int i = 1; i < num.length; i++) {
                    if (num[i]==con && diff == 0){
                        ans++;
                        diff = 1;
                    }
                    else if(num[i]==con){
                        con = num[i];
                    }
                    else{
                        con = num[i];
                        diff= 0;
                    }
                }
                System.out.println(ans);
            }
            catch (Exception e){
                System.out.println("Error");
            }

        }




    }
}
