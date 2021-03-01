import java.util.Locale;

public class _1704 {
    public static void main(String[] args) {
        System.out.println(halvesAreAlike("book"));
        System.out.println(halvesAreAlike("textbook"));
        System.out.println(halvesAreAlike("MerryChristmas"));
        System.out.println(halvesAreAlike("AbCdEfGh"));
        System.out.println(halvesAreAlike("Uo")); //true
    }
    public static boolean halvesAreAlike(String s) {

        int len = s.length()/2;
        s = s.toLowerCase();
        int s1 = 0;
        int s2 = 0;
        for (int i = 0; i < len; i++) {
            if(isPresent(s.charAt(i))){
                s1++;
            }
        }
        for (int i = len; i < s.length(); i++) {
            if(isPresent(s.charAt(i))){
                s2++;
            }
        }
        if(s1==s2){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean isPresent(char ch){
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < vowels.length; i++) {
            if(ch==vowels[i]){
                return true;
            }
        }
        return false;
    }
}
