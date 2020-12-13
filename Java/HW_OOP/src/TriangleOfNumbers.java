import java.util.Scanner;

public class TriangleOfNumbers {
    public static void main(String[] args) {
        System.out.print("Enter N: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        printTriangle(n);
    }

    private static void printTriangle(int n) {
        for (int row = 1; row <= n; row++) {
            int column=0;
            for (column =column; column < n-row; column++) {
                System.out.print(" ");
            }
            int counter = 1;
            for (int i = column; i < n; i++) {
                System.out.print(counter);
                counter++;
            }
            System.out.println();
            
        }
    }
}
