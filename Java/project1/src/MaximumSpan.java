//Incomplete but the logic is right, need to change the structure and input


import java.util.ArrayList;
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
            numbers[i]=Integer.parseInt(numbers2[i]);
        }
        //The only var that I need is int[] numbers
        //solution
        int ans1=0;
        int ans2=0;
        int left = 0;
        int right = numbers.length-1;
        if(numbers[left]!=numbers[right]){
            while(numbers[left]!=numbers[right]){
                right--;
            }
            ans1 = (right - left)+1;
            left = 0;
            right = numbers.length-1;
            while(numbers[left]!=numbers[right]){
                left++;
            }
            ans2 = (right - left)+1;
        }
        else{
            ans1 = (right - left)+1;
        }
        System.out.println(Math.max(ans1,ans2));

    }
}
