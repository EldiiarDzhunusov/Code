package PS09;

public class Hamming {

    private String word1;
    private String word2;
    private int answer=0;

    public Hamming(String word1, String word2) {
        this.word1 = word1;
        this.word2 = word2;
    }
    public int getHammingDistance(){
        for (int i = 0; i < word1.length(); i++) {
            if(word1.charAt(i)!=word2.charAt(i)){
                answer++;
            }
        }
        return answer;
    }
}
