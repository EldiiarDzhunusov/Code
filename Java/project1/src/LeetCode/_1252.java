package LeetCode;

import java.util.Arrays;

public class _1252 {
    public static void main(String[] args) {
        int n = 48, m = 37;
        int[][] indices = {{40,5}};

        int[][] arr = new int[n][m];
        for (int i = 0; i < indices.length; i++) {
            for (int j = 0; j < m; j++) {
                arr[indices[i][0]][j]++;
            }
            for (int j = 0; j < n; j++) {
                arr[j][indices[i][1]]++;
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(arr[i][j]%2!=0){
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
