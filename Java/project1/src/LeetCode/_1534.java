package LeetCode;

public class _1534 {

    public static void main(String[] args) {
        int arr[] = {3, 0, 1, 1, 9, 7};
        int a = 7, b = 2, c = 3;
        //sol
        int val1 = 0;
        int val2 = 0;
        int val3 = 0;
        int ans = 0;
        int size = arr.length;
        for (int i = 0; i < size - 2; i++) {
            for (int j = i + 1; j < size - 1; j++) {
                for (int k = j + 1; k < size; k++) {
                    val1 = Math.abs(arr[i] - arr[j]);
                    val2 = Math.abs(arr[j] - arr[k]);
                    val3 = Math.abs(arr[i] - arr[k]);
                    if (val1 <= a && val2 <= b && val3 <= c) {
                        ans++;
                    }

                }
            }

        }
        System.out.println(ans);
    }
}
