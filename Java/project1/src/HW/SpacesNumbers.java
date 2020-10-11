package HW;

public class SpacesNumbers {
    public static void main(String[] args) {
        int locator = 5;
        int t=1;
        while (t<=5){
            int count = locator;
            while(count>1){
                System.out.print(" ");
                count--;
            }
            int count1 = t;
            while(count1>0){
                System.out.print(t);
                count1--;
            }
            System.out.println();

            locator--;
            t++;
        }

    }
}
