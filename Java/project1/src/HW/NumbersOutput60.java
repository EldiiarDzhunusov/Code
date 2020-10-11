package HW;

public class NumbersOutput60 {
    public static void main(String[] args) {
        int t = 1;
        while (t<=60){
            if(t%10==0){
                System.out.print("|");
            }
            else{
                System.out.print(" ");
            }
            t++;
        }
        System.out.println();
        int counter = 1;
        while (counter<=6){
            int num = 1;
            while(num<=10){
                System.out.print(num%10);
                num++;
            }
            counter++;
        }
        System.out.println();
    }
}
