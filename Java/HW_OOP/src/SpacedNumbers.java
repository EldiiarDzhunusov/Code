public class SpacedNumbers {
    public static void main(String[] args) {
        int locator = 5;
        int t=1;
        while (t<=5){
            int count = locator;
            while(count>0){
                System.out.print(" ");
                count--;
            }
            System.out.println(t);
            locator--;
            t++;
        }

    }
}
