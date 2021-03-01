import java.util.Arrays;

public class _922 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArrayByParityII(new int[]{4,2,5,7})));
    }
    public static int[] sortArrayByParityII(int[] A) {
        int[] evenArray = new int[A.length/2];
        int[] oddArray = new int[A.length/2];
        int evenIndex =0;
        int oddIndex = 0;
        for (int i = 0; i < A.length; i++) {
            if(A[i]%2==0){
                evenArray[evenIndex++] = A[i];
            }
            else {
                oddArray[oddIndex++]= A[i];
            }
        }
        oddIndex=0;
        evenIndex=0;
        for (int i = 0; i < A.length; i++) {
            if(i%2==0){
                A[i] = evenArray[evenIndex++];
            }
            else{
                A[i] = oddArray[oddIndex++];
            }
        }
        return A;
    }
}
