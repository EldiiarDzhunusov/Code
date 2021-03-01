public class _1374 {
    public static void main(String[] args) {
        System.out.println(generateTheString(4));
        System.out.println(generateTheString(2));
        System.out.println(generateTheString(7));
    }
    public static String generateTheString(int n) {
        String ans = "";
        if(n%2==1){
            for (int i = 0; i < n; i++) {
                ans+="a";
            }
        }
        else{
            for (int i = 0; i < n-1; i++) {
                ans+="a";
            }
            ans+="b";
        }
        return ans;
    }
}
