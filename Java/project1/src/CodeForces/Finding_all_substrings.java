package CodeForces;

import java.util.ArrayList;

public class Finding_all_substrings {
    public static void main(String[] args) {
        String word = "abcdefgh";
        ArrayList<String> subString = new ArrayList<>();
        int j = 1;
        while(j<=word.length()){
            for (int i = 0; i <= word.length()-j; i++) {
                subString.add(word.substring(i,i+j));

            }
            j++;
        }
        for (int i = 0; i < subString.size(); i++) {
            System.out.print(subString.get(i) +", ");
        }
    }
}
