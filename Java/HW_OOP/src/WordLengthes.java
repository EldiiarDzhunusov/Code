import java.util.Scanner;

public class WordLengthes {
    public static void main(String[] args) {
        //input
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String[] words = word.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.println((i+1)+" " + len(words[i]));
        }
    }
    public static String len(String word){
        int len1 =0;
        for (int i = 0; i < word.length(); i++) {
            if(((int)word.charAt(i)>=65 && (int)word.charAt(i)<=90) || ((int)word.charAt(i)>=97 && (int)word.charAt(i)<=122)){
                len1++;
            }
        }
        String ans = Integer.toString(len1);
        ans+= "\t";
        for (int i = 0; i < len1; i++) {
            ans+="*";
        }
        return ans;
    }
}
