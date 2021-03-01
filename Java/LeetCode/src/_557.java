public class _557 {
    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }
    public static String reverseWords(String s) {
        String[] word = s.split(" ");
        String ans = "";
        for (int i = 0; i < word.length; i++) {

            StringBuilder input1 = new StringBuilder();
            input1.append(word[i]);
            input1.reverse();

            word[i] = input1.toString();
            ans+=word[i];
            if(i!=word.length-1){
                ans+=" ";
            }
        }
        return ans ;


    }
}
