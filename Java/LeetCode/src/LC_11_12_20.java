public class LC_11_12_20 {
    public static void main(String[] args) {
        int[] arr= {0,1,2,3,4,5,6,7,8,9};
        System.out.println(sol(arr));



    }
    public static boolean sol(int[] arr) {
        if (arr.length < 3) {
            return false;
        }
        int upper=1;
        boolean checker = false;
        boolean checker1= false;
        for (int i = 1; i < arr.length; i++) {
            if(upper==1){
                if(arr[i-1]==arr[i]){
                    return false;
                }
                if(arr[i-1]>arr[i]){
                    upper=0;
                    checker=true;
                }
                else{
                    checker1=true;
                }
            }
            if(upper == 0){
                if(arr[i-1]==arr[i]){

                    return false;
                }
                if(arr[i-1]<arr[i]){

                    return false;
                }
            }
        }
        return (true&&checker&& checker1);
    }
}
