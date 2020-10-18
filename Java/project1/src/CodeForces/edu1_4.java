package CodeForces;

import java.util.ArrayList;
import java.util.Scanner;

public class edu1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t!=0){
            String word = scanner.nextLine();
            String sub = scanner.nextLine();
            solution(word,sub);
            t--;
        }
    }
    public static void solution(String word, String sub){
        int ans=0;
        //Checking for all possible variants (Probably TLE)
        int j = sub.length();
        int n = ((sub.length()-1)*((sub.length()-1)+1)) / 2;
        if(sub.length()>1){
            ans = (word.length()*(sub.length()-1))     - n + (sub.length()-1);
        }

//        for (int i = 1; i < sub.length(); i++) {
//           ans+=word.length()-i+1;
//
//        }

        while(j<=word.length()){
            for (int i = 0; i <= word.length()-j; i++) {
                String s = word.substring(i,i+j);
                if (s.length()<sub.length()){
                    ans++;
                }
                else{
                    if(!s.contains(sub)){
                        ans++;
                    }
                }

            }
            j++;
        }
        System.out.println(ans);
    }

}
