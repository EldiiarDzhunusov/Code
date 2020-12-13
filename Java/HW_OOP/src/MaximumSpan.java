import java.util.Scanner;

public class MaximumSpan {
    public static void main(String[] args) {
        //input and work with it
        Scanner scanner = new Scanner(System.in);
        String numbers1 = scanner.nextLine();
        numbers1 = numbers1.trim();
        String[] numbers2 = numbers1.split(" ");
        int[] numbers = new int[numbers2.length];
        for (int i = 0; i < numbers2.length; i++) {
            numbers[i] = Integer.parseInt(numbers2[i]);
        }
        System.out.println(maxSpan(numbers));
    }
    public static int maxSpan(int[] numbers){
        int ans1 = 0;
        for (int i = 0; i < numbers.length; i++) {
            int right = numbers.length-1;
            while(numbers[i]!=numbers[right] && i<right){
                right--;
            }
            if(right-i>ans1){
                ans1=right-i;
            }
        }
        return (ans1+1);

    }
}
