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
        ArrayList kick = new ArrayList();
        ArrayList start = new ArrayList();
        String kick1 ="KICK";
        for (int index = word.indexOf(kick1);
             index >= 0;
             index = word.indexOf(kick1, index + 1))
        {
            kick.add(index);
        }
        String start1= "START";
        for (int index = word.indexOf(start1);
             index >= 0;
             index = word.indexOf(start1, index + 1))
        {
            start.add(index);
        }




        for (int i = 0; i < kick.size(); i++) {
            for (int j = 0; j < start.size(); j++) {
                int a = Integer.parseInt(kick.get(i).toString());
                int b = Integer.parseInt(start.get(j).toString());
                if(a < b ){
                    ans++;
                }
            }
        }
        System.out.println(ans);

    }
}
