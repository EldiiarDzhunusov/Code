import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class _1370 {
    public static void main(String[] args) {
        System.out.println(sortString("aaaabbbbcccc"));
        System.out.println(sortString("rat"));
        System.out.println(sortString("leetcode"));
        System.out.println(sortString("ggggggg"));
        System.out.println(sortString("spo"));
    }
    public static String sortString(String s) {
        String[] words = s.split("");
        Arrays.sort(words);
        String ans = "";
        int[] arr = new int[words.length];
        if(arr[0]==0){
            ans+=words[0];
            arr[0]=1;
        }
        for (int i = 1; i < words.length; i++) {
            if(words[i].compareTo(words[i-1])!=0 && arr[i]==0){
                arr[i]=1;
                ans+=words[i];
            }
        }
        if(arr[arr.length-1]==0){
            arr[arr.length-1]=1;
            ans+=words[arr.length-1];
        }
        for (int i = words.length - 2; i >= 0; i--) {
            if(arr[i]==0 && words[i].compareTo(words[i+1])!=0){
                arr[i]=1;
                ans+=words[i];
            }
        }
        while(ans.length()<words.length){
            for (int i = 1; i < words.length; i++) {
                if(words[i].compareTo(words[i-1])!=0 && arr[i]==0){
                    arr[i]=1;
                    ans+=words[i];
                }
            }
            for (int i = words.length - 2; i >= 0; i--) {
                if(arr[i]==0 && words[i].compareTo(words[i+1])!=0){
                    arr[i]=1;
                    ans+=words[i];
                }
            }
            for (int i = 0; i < words.length; i++) {
                if(arr[i]==1){
                    words[i] = "GEW";
                }
            }
//            System.out.println(Arrays.toString(words));
//            System.out.println(Arrays.toString(arr));
//            System.out.println(ans);

        }
        return ans;
    }
}
