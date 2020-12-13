//fast enough baby
import java.util.ArrayList;
import java.util.Scanner;

public class edu1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t>0){
            String word = scanner.nextLine();
            solution1(word);
            t--;
        }
    }
    public static void solution1(String word){
        //finding substrings
        ArrayList<String> subString = new ArrayList<>();
        int j = 1;
        while(j<=word.length()){
            for (int i = 0; i <= word.length()-j; i++) {
                subString.add(word.substring(i,i+j));

            }
            j++;
        }

        //compare if they equal to prefix or suffix
        int size = word.length();
        int left = 1;
        int right = word.length()-1;
        int total= 0;
        while(left<=size && right>=0){
            if(word.substring(0,left).compareTo(word.substring(right,size))!=0){
                int k =0;
                while(k+left<=size){
                    if(word.substring(k,k+left).compareTo(word.substring(0,left))==0){
                        total++;
                    }
                    if(word.substring(k,k+left).compareTo(word.substring(right,size))==0){
                        total++;
                    }

                    k++;
                }
            }

            right--;
            left++;
        }
        System.out.println(total);
    }
}
