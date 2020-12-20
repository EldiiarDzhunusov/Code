package Quiz;

import java.util.Arrays;
import java.util.ArrayList;

public class PigLatinTranslator {
    public String translate(String rawWordInput) {
        String ans = "";
        String[] initWordArray = rawWordInput.strip().split("\\s+");
        ArrayList<String> processedWordsList = new ArrayList<String>(Arrays.asList(initWordArray));
        for (int index = 0; index < processedWordsList.size(); ++index) {
            String word = processedWordsList.get(index);
            if (_startsWithVowel(word)) {
                String translatedLeadingVowel = new StringBuilder(word).append("ay").toString();
                processedWordsList.set(index, translatedLeadingVowel);
            } else {
                if (_isConsonantCluster(word.substring(0, 2)) ) {
                    int leadingConsonantClusterChars=3;
                    if(_isVowel(word.charAt(2))|| Character.toLowerCase(word.charAt(2)) == 'y'){
                        leadingConsonantClusterChars=2;
                    }
                    String cluster = word.substring(0, leadingConsonantClusterChars);

                    String suffix = new StringBuilder(cluster).append("ay").toString().toLowerCase();

                    String translatedLeadingCluster = new StringBuilder(word).delete(0, leadingConsonantClusterChars).append(suffix).toString();

                    processedWordsList.set(index, translatedLeadingCluster);
                }

                else if (word.length() > 2 && word.substring(1, 3).equalsIgnoreCase("qu")) {
                    // Extract leading consonant and "qu"
                    String cluster = word.substring(0, 3);
                    String suffix = new StringBuilder(cluster).append("ay").toString().toLowerCase();
                    String translatedConsonantQU = new StringBuilder(word).delete(0, 3).append(suffix).toString();
                    processedWordsList.set(index, translatedConsonantQU);
                }
                else if (word.length() == 2 && word.charAt(1) == 'y') {
                    String translated2CharY = new StringBuilder(word).reverse().append("ay").toString().toLowerCase();
                    processedWordsList.set(index, translated2CharY);
                }
                else {
                    String suffix = word.charAt(0)+"ay";
                    if(_isConsonantCluster(word.substring(1, 3))){
                        suffix =  word.substring(0, 3) + "ay";
                    }
                    String translatedWord;
                    if (_isConsonantCluster(word.substring(1, 3))) {

                        translatedWord = new StringBuilder(word).append(suffix).delete(0, 3).toString();
                    } else {
                        translatedWord = new StringBuilder(word).append(suffix).deleteCharAt(0).toString();
                    }
                    processedWordsList.set(index, translatedWord);
                }
            }
            ans = processedWordsList.get(0);
            if(processedWordsList.size()>1){
                ans =  String.join(" ", processedWordsList);
            }
        }
        return ans;
    }
    private boolean _isVowel(char char1) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        boolean isVowel = false;
        for (char vowel : vowels) {
            if (vowel == char1) {
                isVowel = true;
                break; }
        }
        return isVowel;
    }
    private boolean _isConsonantCluster(String str1) {
        String[] consonantClusters = {"sh", "ch", "wh", "th", "ph", "qu", "rh"};
        boolean isCluster = false;
        for (String cluster : consonantClusters) {
            if (str1.equalsIgnoreCase(cluster)) {
                isCluster = true;
                break;
            }
        }
        return isCluster;
    }
    private boolean _startsWithVowel(String word) {
        boolean startsVowel1 = false;
        if (word.substring(0, 2).equalsIgnoreCase("xr")
                || word.substring(0, 2).equalsIgnoreCase("yt")) {
            startsVowel1 = true;
        } else {
            startsVowel1 = _isVowel(word.charAt(0));
        }
        return startsVowel1;
    }
}