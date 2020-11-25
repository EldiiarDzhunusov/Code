package LeetCode;

public class _1662 {
    public static void main(String[] args) {
        String[] word1 ={"hel","lo"};
        String[] word2 ={"he","llo"};
        String ans1 = "";
        String ans2 = "";
        for (int i = 0; i < word1.length; i++) {
            ans1+=word1[i];
        }
        for (int i = 0; i < word2.length; i++) {
            ans2+=word2[i];
        }
        System.out.println(ans1.equals(ans2));
    }
}
