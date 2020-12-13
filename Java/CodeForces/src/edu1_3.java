import java.util.ArrayList;
import java.util.Scanner;

public class edu1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t>0){
            String word = scanner.nextLine();
            String sub = scanner.nextLine();
            solution1(word,sub);
            t--;
        }
    }
    public static void solution1(String word, String sub){
        int sizeSub = sub.length();
        int sizeWord = word.length();
        ArrayList<Integer> array = new ArrayList<>();
        int k = 0;
        int ans = 0;
        int check = 0;
        while(k+sizeSub<=sizeWord){
            //here i check words by their index;
            for (int i = 0; i < sizeSub; i++) {
                if(sub.charAt(i)!=word.charAt(k+i) && sub.charAt(i)!='?'){
                    check=0;
                    break;
                }
                check = 1;


            }
            if(check==1){
                ans++;
                array.add(k);
            }
            check=0;

            k++;
        }
        System.out.println(ans);
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i)+" ");
        }
        System.out.println();

    }
}
