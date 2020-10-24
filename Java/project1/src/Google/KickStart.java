package Google;

import java.util.ArrayList;
import java.util.Scanner;

public class KickStart {
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
        int ans = 0;
        int size = word.length();
        int kick = 0;

        for (int i = 0; i < word.length()-4; i++) {
            if(word.charAt(i)=='K' && word.charAt(i+1)=='I' && word.charAt(i+2)=='C' && word.charAt(i+3)=='K'){
                kick+=1;
            }
            if(word.charAt(i)=='S' && word.charAt(i+1)=='T' && word.charAt(i+2)=='A' && word.charAt(i+3)=='R' && word.charAt(i+4)=='T'){
                ans+=kick;
            }
        }
        System.out.println(ans);



    }
}
