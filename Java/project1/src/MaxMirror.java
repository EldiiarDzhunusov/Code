import java.util.Arrays;
import java.util.Scanner;

public class MaxMirror {
    public static void main(String[] args) {
        //input
        Scanner scanner = new Scanner(System.in);
        String numbers1 = scanner.nextLine();
        numbers1 = numbers1.trim();
        String[] numbers2 = numbers1.split(" ");
        int[] numbers = new int[numbers2.length];
        //transfering my String[] to int[]
        for (int i = 0; i < numbers2.length; i++) {
            numbers[i]=Integer.parseInt(numbers2[i]);
        }
        int count = 0 ;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                //&& (j!=numbers.length-1 && i!=0))
                if(i!=j && numbers[i]==numbers[j] ){
                    int i1=i;
                    int j1=j;
                    int localCount = 0;
                    while(numbers[i1]==numbers[j1] &&(j1<numbers.length && j1>0) && i1<j1){
                        localCount++;
                        i1++;
                        j1--;
                    }
                    if(localCount>count){
                        count = localCount;
                    }

                }
            }
        }
        System.out.println(count);


    }
}
