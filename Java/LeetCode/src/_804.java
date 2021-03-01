import java.util.HashSet;

public class _804 {
    public static void main(String[] args) {
        System.out.println(uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg"}));
    }
    public static int uniqueMorseRepresentations(String[] words) {
        String[] alphabet = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> hashSet= new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            String s = "";
            for (int j = 0; j < words[i].length(); j++) {
                int index = ((int)words[i].charAt(j))-97;
                s+=alphabet[index];
            }
            hashSet.add(s);
        }
        return hashSet.size();
    }
}
