import java.util.Arrays;
import java.util.Comparator;

public class _1637 {
    public static void main(String[] args) {
        int[][] points = {{3,1},{9,0},{1,0},{1,4},{5,3},{8,8}};
        //sort by their first element
        Arrays.sort(points, Comparator.comparingDouble(o -> o[0]));
        int ans = 0;
        for (int i = 1; i < points.length; i++) {
            if(points[i][0]-points[i-1][0]>ans){
                ans = points[i][0]-points[i-1][0];
            }
        }
        System.out.println(ans);

    }
}
