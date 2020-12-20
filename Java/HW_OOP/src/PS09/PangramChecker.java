package PS09;

import java.util.HashSet;
import java.util.Locale;

public class PangramChecker {

    public boolean isPangram(String word){
        word = word.toLowerCase(Locale.ROOT);
        HashSet<Character> hashSet = new HashSet<>();
        for (int i = 0; i < word.length(); i++) {
            if(((int)word.charAt(i))>=97 && ((int)word.charAt(i))<=122){
                hashSet.add(word.charAt(i));
            }
        }
        if(hashSet.size()==26){
            return true;
        }
        else{
            return false;
        }
    }
}
