package LeetCode;
//not finished
public class _1616 {
    public static void main(String[] args) {
        String a = "xbdef";
        String b = "xecab";
        boolean ans = checkPalindromeFormation(a,b);
        System.out.println(ans);
    }

    public static boolean checkPalindromeFormation(String a, String b) {
        int size = a.length();
        int k = size;
        for (int i = 0; i < size; i++) {
            String newA1=a.substring(0,i+1);//check
            String newb1=b.substring(0,i+1);
            String newA2=a.substring(k-1,size);//check
            String newb2=b.substring(k-1,size);
            String first = newA1+newb2;
            String second = newb1+newA2;
            boolean ans1 =true;
            boolean ans2 = true;
            int t =0;
            int end=first.length()-1;
            while(t>end){
                if(Character.compare(first.charAt(t),first.charAt(end))!=0) {
                    ans1 = false;
                }
                if(Character.compare(second.charAt(t),second.charAt(end))!=0) {
                    ans2 = false;
                }
                t++;
                end--;
            }
            if(ans1 || ans2){
                return true;
            }
        }
        return false;


    }
}
