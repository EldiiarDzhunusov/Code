public class FindNumberswithEvenNumberofDigits {
    public static void main(String[] args) {
        int[] nums = {12,123,1234,1231,1234};
        //solution
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            String number = Integer.toString(nums[i]);
            if(number.length()%2==0){
                ans++;
            }
        }
        //return ans;
    }
}
