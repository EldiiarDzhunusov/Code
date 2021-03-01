import java.util.Arrays;

public class _942 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(DiStringMatch("IDID")));
        System.out.println(Arrays.toString(DiStringMatch("III")));
        System.out.println(Arrays.toString(DiStringMatch("DDI")));
    }
    public static int[] DiStringMatch(String S) {
        int[] arr = new int[S.length()+1];
        int n  = S.length();
        int small = 0;

        for (int i = 0; i < S.length(); i++) {
            if(S.charAt(i)=='I'){
                arr[i] = small;
                small++;
            }
            else{
                arr[i] = n;
                n--;
            }
        }
        arr[S.length()] = n;
        return arr;
    }
}
