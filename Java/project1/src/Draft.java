
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Draft{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int size = scanner.nextInt();
            int[] numbers = new int[size];
            for (int j = 0; j < numbers.length; j++) {
                numbers[j] = scanner.nextInt();
            }
            solution(numbers,size);
        }
        int[] a = new int[10];


    }
    public static void solution(int[] numbers,int size){
        int sum = 0;
        int[] numbers1 = Arrays.copyOf(numbers,size);

        ArrayList<Integer> indexes = new ArrayList<>();


        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (sum+numbers[j]!=0 && numbers[j]!=100) {
                    indexes.add(j);
                    sum += numbers[j];
                    numbers[j] = 100;
                    break;
                }
            }
        }
        String ans="YES";
        for (int i = 0; i < size; i++) {
            if(numbers[i]!=100){
                ans= "NO";
            }
        }
        System.out.println(ans);
        if(ans.compareTo("YES")==0){
            for (int i = 0; i < size; i++) {
                System.out.print(numbers1[indexes.get(i)]+ " ");
            }
            System.out.println();
        }




    }
}



