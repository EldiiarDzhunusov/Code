package PS12;

import java.util.HashMap;
import java.util.Locale;

public class IsogramChecker {
    private HashMap<Character,Integer> hashMap= new HashMap<>();

    public IsogramChecker() {
        for (int i = 97; i <= 122; i++) {
            hashMap.put((char)i,0);
        }
    }

    public boolean isIsogram(String word){
        word = word.toLowerCase(Locale.ROOT);
        for (int i = 0; i < word.length(); i++) {
            if((int)word.charAt(i)>=97 && (int)word.charAt(i)<=122){
                hashMap.replace(word.charAt(i),hashMap.get(word.charAt(i))+1);
            }
        }
        for (int i = 97; i <= 122; i++) {
            if(hashMap.get((char)i)>1){
                return false;
            }
        }
        return true;
    }
}
