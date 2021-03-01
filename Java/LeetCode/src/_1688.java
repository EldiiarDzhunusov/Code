public class _1688 {
    public static void main(String[] args) {
        System.out.println(numberOfMatches(7));
        System.out.println(numberOfMatches(14));
    }
    public static int numberOfMatches(int n) {
        int ans = 0;
        while(n>1){
            if(n%2==0){
                n/=2;
                ans+=n;

            }
            else{
                n= (n/2)+1;
                ans+=n-1;

            }

        }
        return ans;
    }
}
