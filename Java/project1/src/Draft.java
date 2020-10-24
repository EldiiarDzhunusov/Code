
import java.util.ArrayList;
import java.util.Scanner;

public class Draft {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int ans = 0;
        ArrayList<Integer> vector = new ArrayList<>();
        int size = -1;
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i)=='a'){
                if(size>-1){
                    if(i-vector.get(size)>ans){
                        ans = i-vector.get(size);
                    }
                }
                vector.add(i);
                size++;
            }
        }
        System.out.println(ans);
    }

}
