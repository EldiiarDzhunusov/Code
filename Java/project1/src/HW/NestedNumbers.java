package HW;

public class NestedNumbers {
    public static void main(String[] args) {
        int t=0;
        while(t<3){
            int i=0;
            while(i<10){
                int b=0;
                    while(b<3){
                        System.out.print(i);
                        b++;
                    }
                i++;
            }
            System.out.println();
            t++;
        }
    }
}
