import java.util.Scanner;

public class CF697_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t--!=0){
            long num = scanner.nextLong();
            solution(num);

        }
    }
    public static void solution(long num){

        while(num%2 == 0){
            num/=2;
        }
        if(num==1){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }

    }
}
