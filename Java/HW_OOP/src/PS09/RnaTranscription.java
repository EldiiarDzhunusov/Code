package PS09;

public class RnaTranscription {

    public String transcribe(String word){
        String ans = "";
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            switch (ch){
                case 'G':
                    ans+="C";
                    break;
                case 'C':
                    ans+="G";
                    break;
                case 'T':
                    ans+="A";
                    break;
                case 'A':
                    ans+="U";
                    break;
                default:
                    break;
            }
        }
        return ans;
    }
}
