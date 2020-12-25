package PS12;

public class Acronym {
    private String phrase;

    public Acronym(String phrase) {

        this.phrase = phrase;
    }

    public String get(){
        String word1 = phrase.trim();
        String ans = "";
        String[] words = word1.split(" ");
        for (int i = 0; i < words.length; i++) {
            char ch = words[i].charAt(0);

            if((((int)ch) >=65 && ((int)ch) <=90) || (((int)ch) >=97 && ((int)ch) <=122)){
                ans+=Character.toUpperCase(ch);
            }
            else{
                int order = 0;
                while (order<words[i].length()-1){
                    char ch1 = words[i].charAt(order);
                    if((((int)ch1) >=65 && ((int)ch1) <=90) || (((int)ch1) >=97 && ((int)ch1) <=122)){
                        ans+=Character.toUpperCase(ch1);
                        break;
                    }
                    order++;


                }
            }
        }
        return ans;



    }

}
