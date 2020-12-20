import java.util.Arrays;

public class _905 {
    public static void main(String[] args) {
        int A[] = {3,1,2,4};
        System.out.println(Arrays.toString(sol(A)));
    }
    public static int[] sol(int[] A){
        int even=0;
        int odd=A.length-1;
        int[] arr = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            if(A[i]%2==0){
                arr[even++]=A[i];
            }
            else{
                arr[odd--]=A[i];
            }
        }
        return arr;
    }

}
