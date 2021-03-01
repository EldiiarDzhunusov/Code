import java.util.Scanner;

public class CF697_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t--!=0){
            long num = scanner.nextLong();
            solution(num);

        }
    }
    public static void solution(long num){
        while(num >2021 ){
            if(num%2020==0){
                System.out.println("YES");
            }
            else{
                num-=2021;
            }
        }
        if(num==0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }
}
