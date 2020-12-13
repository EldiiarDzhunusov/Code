import java.util.Scanner;

public class OddsComeFirst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
            if(nums[i]%2==1){
                System.out.print(nums[i]+" ");
            }
        }
        for (int i = 0; i < size; i++) {
            if(nums[i]%2==0){
                System.out.print(nums[i]+" ");
            }
        }

    }
}
