import java.util.Arrays;

public class RecursionTraining {
    public static void main(String[] args) {

//        System.out.println(fibonacci(20));
//        System.out.println(binarySearch(new int[]{1,2,3,4,5,6},0,5,1));
//        printAll(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16},0,15);
//        bit("",8);
//        bracket("",0,0,3);
//        PermutationWithRepetitions(new int[]{1,2,3,4},"",4);
//        int arr[] = {1,4,3,2};
//        System.out.println(Arrays.toString(arr));
//        sort(arr,0,arr.length-1);
//        System.out.println(Arrays.toString(arr));
//        permutation(new int[]{1,2,3,4},0,0,"");
        powerSet(new int[]{1,2,3,4},0,"");

    }
    public static void permutation(int[] arr,int i, int j, String s){
        if(arr.length==s.length()){
            System.out.println(s);
            return;
        }
        //not implemented
//        if(j==i+arr.length){
//            permutation(arr,i+1,0,s);
//        }
//        permutation(arr,i,j+1,s+arr[]);
    }
    public static void powerSet(int[] arr, int index,String s){
        if(index==arr.length){
            System.out.println(s);
            return;
        }
        powerSet(arr,index+1,s+arr[index]);
        powerSet(arr, index+1, s);
    }
    public static void sort(int[] arr, int left, int right){

        if(left>=right){
            return;
        }
        int mid = left+(right-left)/2;
        sort(arr,left,mid);
        sort(arr,mid+1,right);
        merge(arr,left,right);

    }
    public static void merge(int[] arr, int left,int right){
        int mid = left + (right-left)/2;
        int[] A = new int[mid-left+1];
        int[] B = new int[right-mid];

        for (int i = left, index = 0; i <= mid;index++, i++) {
            A[index] = arr[i];
        }
        for (int i = mid+1,index = 0; i <= right;index++, i++) {
            B[index] = arr[i];
        }

        int index = left;
        int index1 = 0;
        int index2 = 0;
        while(true){
            if(index1>=A.length || index2>=B.length){
                break;
            }
            if(A[index1]<B[index2]){
                arr[index]= A[index1];
                index++; index1++;
            }
            else{
                arr[index]= B[index2];
                index++;      index2++;
            }
        }
        while(index1<A.length){
            arr[index]= A[index1];
            index++; index1++;
        }
        while(index2<B.length){
            arr[index]= B[index2];
            index++;     index2++;
        }

    }
    public static void PermutationWithRepetitions(int[] arr, String s, int n){
        if(s.length()==n){
            System.out.println(s);
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            PermutationWithRepetitions(arr,s+arr[i],n);
        }

    }
    public static void bracket(String s,int open, int closed, int n){
        if(s.length() == n*2){
            System.out.println(s);
            return;
        }
        if(s.length()==0){
            bracket("(",1,0,n);
        }
        else{
            if(open<n){
                bracket(s+"(",open+1,closed,n);
            }
            if(closed<open){
                bracket(s+")",open,closed+1,n);
            }
        }
    }

    public static void bit(String s,int n){
        if(s.length()==n){
            System.out.println(s);
            return;
        }
        if(s.length()==0){
            bit("1",n);
            bit("0",n);
        }
        else{
            if(s.charAt(s.length()-1)=='1'){
                bit(s+"0",n);
            }
            bit(s+"1",n);
        }
    }

    public static void printAll(int[] arr, int l, int r){
        int mid = (l+r)/2;
        for (int i = l; i <= r; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        if(r-l==0){
//            System.out.println(arr[mid]);
            return;
        }


        printAll(arr,l,mid);
        printAll(arr,mid+1,r);


    }

    public static int binarySearch(int[] arr, int l, int r, int key){
        int mid = l+ (r-l)/2;
        if(l>r){
            return -1;
        }
        if(arr[mid]==key){
            return mid;
        }
        if(arr[mid]<key){
            return binarySearch(arr,mid+1,r,key);
        }
        else{
            return binarySearch(arr,l,mid-1,key);
        }
    }
}
