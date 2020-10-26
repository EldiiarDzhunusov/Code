package Google;

import java.util.Scanner;

public class NestingDepth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        int caseNumber = 1;
        while (t > 0) {
            String word = scanner.nextLine();
            System.out.printf("Case #%d: ", caseNumber);
            solution(word);
            caseNumber++;
            t--;
        }
    }

    public static void solution(String word) {
        String ans = "";
        int brackets = 0;
        for (int i = 0; i < word.length(); i++) {

            int num = Character.getNumericValue(word.charAt(i));
            if(brackets<num){
                while(brackets!=num){
                    ans+="(";
                    brackets++;
                }
            }
            if(brackets>num){
                while(brackets!=num){
                    ans+=")";
                    brackets--;
                }
            }
            ans+=Integer.toString(num);
        }
        while (brackets>0){
            ans+=")";
            brackets--;
        }
        System.out.println(ans);
    }
}
