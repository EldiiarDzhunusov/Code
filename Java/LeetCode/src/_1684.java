public class _1684 {
    public static void main(String[] args) {
        System.out.println(countConsistentStrings("ab", new String[]{"ad","bd","aaab","baa","badab"}));
        System.out.println(countConsistentStrings("abc", new String[]{"a","b","c","ab","ac","bc","abc"}));
        System.out.println(countConsistentStrings("cad", new String[]{"cc","acd","b","ba","bac","bad","ac","d"}));
    }
    public static int countConsistentStrings(String allowed, String[] words) {
        int ans = 0;
        String[] word1 = allowed.split("");
        for (int i = 0; i < words.length; i++) {
            if(isPresent(word1,words[i])==true){
                ans++;
            }
        }
        return ans;

    }
    public static boolean isletter(String[] allowed, String word){
        for (int i = 0; i < allowed.length; i++) {
            if(word.compareTo(allowed[i])==0){
                return true;
            }
        }
        return false;
    }
    public static boolean isPresent(String[] allowed , String word){
        for (int i = 0; i < word.length(); i++) {
            if(isletter(allowed,word.substring(i,i+1))==false){
                return false;
            }
        }
        return true;
    }
}
