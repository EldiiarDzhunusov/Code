import java.util.Scanner;

public class Draft{
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println(a);
        System.out.println(b);
    }

}