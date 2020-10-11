package HW;

import java.util.Scanner;

public class SplitSentence {
    public static void main(String args[]) {
        // declaration
        Scanner console = new Scanner(System.in);

        // input
        System.out.print("Enter the single line text please: ");
        String sentence = console.nextLine();

        // processing
        splitSentence2Words(sentence);
    }


    private static void splitSentence2Words(String clause) {
        int i=0;
        int check = 1;
        while(i<clause.length()){
            if ((clause.charAt(i)>='a' && clause.charAt(i)<='z')||(clause.charAt(i)>='A' && clause.charAt(i)<='Z')){
                System.out.print(clause.charAt(i));
                check=0;
            }
            else{
                if(clause.charAt(i)=='\''){
                    check=1;
                }
                else if(clause.charAt(i)=='’' && ((clause.charAt(i+1)>='a' && clause.charAt(i+1)<='z')||(clause.charAt(i+1)>='A' && clause.charAt(i+1)<='Z'))){
                    check=1;
                }
                else if (check==0) {
                    System.out.println();
                    check=1;
                }

            }
            i++;
        }


    }
}