import java.util.Arrays;

public class LC_8_12_20 {
    public static void main(String[] args) {
        int[] time = {30,20,150,100,40};


        int[] arr= new int[60];
        for (int i = 0; i < time.length; i++) {
            arr[time[i]%60]++;
        }

        int ans = 0;
        int i = arr[0];
        ans = ((i*(i-1))/2);

        int j=59;
        i=1;
        while(i<j){
            ans+=arr[i++]*arr[j--];
        }
        i=arr[30];

        ans += ((i*(i-1))/2);

        System.out.println(ans);
    }

}
